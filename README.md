# jBanglaDate

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
'''
<project>
...................
	<repositories>
		<repository>
			<id>java.net</id>
			<url>http://maven.shahriar.io/maven/6d00b1f7-2400-462e-9f73-b8d516e5bafc/</url>
		</repository>
	</repositories>
	<dependencies>
			<dependency>
			<groupId>io.shahriar.jBanglaDate</groupId>
			<artifactId>jBanglaDate</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
	</dependencies>
...............
<project>
'''
