package UDF;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

    public class MyUDF extends UDF {
//        public Integer evaluate(Text strs){
//            int sum=0;
//            String[] strings = strs.toString().split(",");
//            for (int i =0;i<strings.length;i++){
//                sum += Integer.parseInt(strings[i]);
//            }
//            return sum;
//        }

        public int evaluate (String flows){
            int sum =0;
            String[] flowss = flows.split(",");
            for (int i =0;i<flowss.length;i++){
                sum += Integer.parseInt(flowss[i]);
            }
            return sum;
        }

}
