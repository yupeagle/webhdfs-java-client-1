webhdfs-java-client
===================

Hadoop WebHDFS REST API's java client code with kerberos auth.

This project use the [zxf/webhdfs-java-client project](https://github.com/zxs/webhdfs-java-client).

Todo
----

-   Implement each hdfs command
-   Migrate zxf's project to depend on latest hdp2

Test
----

Run the test with the following system properties:

-   `test.realm`     Kerberos realm
-   `test.kdc`	     Kerberos KDC host
-   `test.principal` Kerberos principal
-   `test.password`  Kerberos password
-   `test.webhdfs`   WebHDFS url (eg: "http://localhost:50070")
