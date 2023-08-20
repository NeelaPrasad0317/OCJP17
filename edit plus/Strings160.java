import java.time.*;
public class Strings160
{
	public static void main(String[] args) throws Exception
	{

		System.out.println("abc".replace("b",123+""));

		String s1="abc";
		String s2="abc";
		String s3="abc"+"";
		System.out.println(s1==s2);
		s3+="";				//if we do operation after declaration, the string is not from pool anymore.
		System.out.println(s1==s2);
		System.out.println(s3==s2);

		System.out.println(s1.substring(1).charAt(1));//s1 wont change. but in chaining the operations will on resultant string
														//if we dont catch that result it will go waste. not effect on s1

		//white spaces==> space( ),new line(\n),tab(\t),carriage return(\r)
		s3="\t abc\n\\n\r";
		System.out.println(s3.length());
		System.out.println(s3.trim().length());
		System.out.println(s3.strip().length());
		System.out.println(s3.stripLeading().length());
		System.out.println(s3.stripTrailing().length());
		System.out.println(s3.translateEscapes().strip().length());
		System.out.println();

		//for text blocks, first(""") always in one line. rest come in new line. else CE
		s1="""					
		\tabc\n""";
		System.out.println(s1.length());
		System.out.println(s1.indent(2).length());
		System.out.println(s1.indent(2).stripIndent().length());
		System.out.println();

		s2=s1.indent(2);
		System.out.println(s1.indent(2).indent(2).length());
		System.out.println(s2.indent(2).length());
		System.out.println();System.out.println();

		s1="\tabc";
		System.out.println(s1.length());
		System.out.println(s1.indent(2).length());//7-->2indent, 1tab, 3chars, 1\n added by indent
		System.out.println(s1.stripIndent().length());//3--> removed tab
		System.out.println(s1.indent(1).stripIndent().length());//6-->_ tab a b c \n
		System.out.println(s1.indent(1).stripIndent());//6-->_ tab a b c \n there is no effect of stripIndexnt after indent()
		System.out.println(s1.stripIndent().indent(1).length());//5
		System.out.println();

		s2=s1.indent(2);
		System.out.println(s1.indent(2).indent(2).length());//9-->4 indent tab a b c \n
		System.out.println(s2.indent(2).length());//9
		System.out.println();

		s1="\t\tabc\n\tdef";
		System.out.println(s1.length());//10
		System.out.println(s1.indent(1).length());//13
		System.out.println(s1.indent(1).stripIndent().length());//13
		System.out.println(s1.stripIndent().length());//8--> \t abc \n def


		//testing cancatenantion and formatiing performance.
		var name = "Kate";
		var orderId = 5;
		Instant i1,i2;

		i1=Instant.now();
		Thread.sleep(1);
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		System.out.println(String.format("Hello %s, order %d is ready", name, orderId));
		i2=Instant.now();
		System.out.println(Duration.between(i1,i2).toMillis());

		i1=Instant.now();
		Thread.sleep(1);
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println("Hello "+name+", order "+orderId+" is ready");
		i2=Instant.now();
		System.out.println(Duration.between(i1,i2).toMillis());

		i1=Instant.now();
		Thread.sleep(1);
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		i2=Instant.now();
		System.out.println(Duration.between(i1,i2).toMillis());

		var sb=new StringBuilder("ab");
		System.out.println(sb.length());
//		System.out.println(sb.size());
		System.out.println(sb.capacity());
		sb.append("01234567890123456");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
