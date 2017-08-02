# jBanglaDate

[![Build Status](http://jenkins.shahriar.io/buildStatus/icon?job=jbangladate)](http://jenkins.shahriar.io/job/jbangladate/)

Example Use:
```java
		BanglaDate banglaDate = BanglaDate.now();
		System.out.println(banglaDate);
		System.out.println(banglaDate.getBanglaDay());
		System.out.println(banglaDate.getBanglaMonth());
		System.out.println(banglaDate.getBanglaYear());
		System.out.println(banglaDate.getBanglaMonthValue());
```

OutPut:
The result:
```
২৬-কার্তিক-১৪২৩
২৬
কার্তিক
১৪২৩
১০
```

Add Maven Dependecy:
```xml
<project>
...................
	<repositories>
		<repository>
			<id>6d00b1f7-2400-462e-9f73-b8d516e5bafc</id>
			<url>http://maven.shahriar.io/maven/maven/</url>
		</repository>
	</repositories>
	<dependencies>
			<dependency>
			<groupId>io.shahriar.jbangladate</groupId>
			<artifactId>jbangladate</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
	</dependencies>
...............
<project>
```

