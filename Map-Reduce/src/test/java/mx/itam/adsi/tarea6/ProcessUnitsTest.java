package mx.itam.adsi.tarea6;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

import mx.itam.adsi.tarea6.ProcessUnits.E_EMapper;
import mx.itam.adsi.tarea6.ProcessUnits.E_EReduce;

public class ProcessUnitsTest {
	public static void main(String args[])throws Exception
	{
	   JobConf conf = new JobConf(Eleunits.class);
			
	   conf.setJobName("max_eletricityunits");
			
	   conf.setOutputKeyClass(Text.class);
	   conf.setOutputValueClass(IntWritable.class);
			
	   conf.setMapperClass(E_EMapper.class);
	   conf.setCombinerClass(E_EReduce.class);
	   conf.setReducerClass(E_EReduce.class);
			
	   conf.setInputFormat(TextInputFormat.class);
	   conf.setOutputFormat(TextOutputFormat.class);
			
	   FileInputFormat.setInputPaths(conf, new Path(args[0]));
	   FileOutputFormat.setOutputPath(conf, new Path(args[1]));
			
	   JobClient.runJob(conf);
	}
}
