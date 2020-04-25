# Java User Model Initial Version for OAuth2 Security

## Introduction

This is a basic database scheme with users, user emails, and user roles. This Java Spring REST API application will provide endpoints for clients to perform the various CRUD operations on data sets contained in the application's data.

### Database layout

The table layout is as follows

- User is the driving table.
- Useremails have a Many-To-One relationship with User. Each User has many user email combinations. Each user email combination has only one User.
- Roles have a Many-To-Many relationship with Users.

![Image of Database Layout](usersdb.png)

### Using the provided seed data, expand each endpoint below to see the output it generates.

<details>
<summary>http://localhost:2019/useremails/useremails</summary>

```JSON
[
    {
        "useremailid": 5,
        "useremail": "admin@email.local",
        "user": {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 1,
                        "name": "ADMIN"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                },
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 6,
        "useremail": "admin@mymail.local",
        "user": {
            "userid": 4,
            "username": "admin",
            "primaryemail": "admin@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 1,
                        "name": "ADMIN"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                },
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 8,
        "useremail": "cinnamon@mymail.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 9,
        "useremail": "hops@mymail.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 10,
        "useremail": "bunny@email.local",
        "user": {
            "userid": 7,
            "username": "cinnamon",
            "primaryemail": "cinnamon@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 3,
                        "name": "DATA"
                    }
                },
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 12,
        "useremail": "barnbarn@email.local",
        "user": {
            "userid": 11,
            "username": "barnbarn",
            "primaryemail": "barnbarn@lambdaschool.local",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 16,
        "useremail": "vfvo46@gmail.com",
        "user": {
            "userid": 15,
            "username": "elmer.powlowski",
            "primaryemail": "johnie.mayer@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 18,
        "useremail": "puii03@gmail.com",
        "user": {
            "userid": 17,
            "username": "lonnie.monahan",
            "primaryemail": "jo.kemmer@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 20,
        "useremail": "ejxs87@gmail.com",
        "user": {
            "userid": 19,
            "username": "rod.rolfson",
            "primaryemail": "cathy.bernhard@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 22,
        "useremail": "ypzy48@gmail.com",
        "user": {
            "userid": 21,
            "username": "elisha.waters",
            "primaryemail": "emanuel.mckenzie@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 24,
        "useremail": "abij95@gmail.com",
        "user": {
            "userid": 23,
            "username": "reba.paucek",
            "primaryemail": "dena.baumbach@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 26,
        "useremail": "gfzq84@gmail.com",
        "user": {
            "userid": 25,
            "username": "dana.abbott",
            "primaryemail": "ming.rowe@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 28,
        "useremail": "nuyd99@gmail.com",
        "user": {
            "userid": 27,
            "username": "luis.schroeder",
            "primaryemail": "wyatt.rath@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 30,
        "useremail": "mumw32@gmail.com",
        "user": {
            "userid": 29,
            "username": "darlena.hintz",
            "primaryemail": "hedy.douglas@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 32,
        "useremail": "gkns62@gmail.com",
        "user": {
            "userid": 31,
            "username": "devon.gislason",
            "primaryemail": "cruz.kautzer@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 34,
        "useremail": "cvsb59@gmail.com",
        "user": {
            "userid": 33,
            "username": "earlie.feil",
            "primaryemail": "randy.roberts@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 36,
        "useremail": "xklj91@gmail.com",
        "user": {
            "userid": 35,
            "username": "bernetta.botsford",
            "primaryemail": "clayton.hamill@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 38,
        "useremail": "khql44@gmail.com",
        "user": {
            "userid": 37,
            "username": "quintin.kertzmann",
            "primaryemail": "jeniffer.treutel@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 40,
        "useremail": "etcd27@gmail.com",
        "user": {
            "userid": 39,
            "username": "lovetta.ratke",
            "primaryemail": "elvis.kutch@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 42,
        "useremail": "ztcs89@gmail.com",
        "user": {
            "userid": 41,
            "username": "brent.predovic",
            "primaryemail": "orville.purdy@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 44,
        "useremail": "zmzo62@gmail.com",
        "user": {
            "userid": 43,
            "username": "lillian.bednar",
            "primaryemail": "lucien.schroeder@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 46,
        "useremail": "biad66@gmail.com",
        "user": {
            "userid": 45,
            "username": "kathi.watsica",
            "primaryemail": "margarito.hickle@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 48,
        "useremail": "hopg63@gmail.com",
        "user": {
            "userid": 47,
            "username": "gilberto.bahringer",
            "primaryemail": "merle.williamson@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 50,
        "useremail": "qont54@gmail.com",
        "user": {
            "userid": 49,
            "username": "rickie.kovacek",
            "primaryemail": "laine.stehr@hotmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 52,
        "useremail": "xvvk90@gmail.com",
        "user": {
            "userid": 51,
            "username": "tashia.breitenberg",
            "primaryemail": "abdul.cummerata@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 54,
        "useremail": "rbry74@gmail.com",
        "user": {
            "userid": 53,
            "username": "vanessa.stamm",
            "primaryemail": "alda.ratke@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 56,
        "useremail": "gilg74@gmail.com",
        "user": {
            "userid": 55,
            "username": "christia.ondricka",
            "primaryemail": "carola.roob@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 58,
        "useremail": "muon24@gmail.com",
        "user": {
            "userid": 57,
            "username": "twana.mcclure",
            "primaryemail": "josiah.douglas@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 60,
        "useremail": "kfxq64@gmail.com",
        "user": {
            "userid": 59,
            "username": "john.effertz",
            "primaryemail": "corrin.murphy@gmail.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 62,
        "useremail": "eybv29@gmail.com",
        "user": {
            "userid": 61,
            "username": "rogelio.vonrueden",
            "primaryemail": "joyce.connelly@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    },
    {
        "useremailid": 64,
        "useremail": "dgpt49@gmail.com",
        "user": {
            "userid": 63,
            "username": "douglass.schumm",
            "primaryemail": "priscilla.jacobson@yahoo.com",
            "roles": [
                {
                    "role": {
                        "roleid": 2,
                        "name": "USER"
                    }
                }
            ]
        }
    }
]
```

</details>
<details>
<summary>http://localhost:2019/useremails/useremail/8</summary>

```JSON
{
    "useremailid": 8,
    "useremail": "cinnamon@mymail.local",
    "user": {
        "userid": 7,
        "username": "cinnamon",
        "primaryemail": "cinnamon@lambdaschool.local",
        "roles": [
            {
                "role": {
                    "roleid": 3,
                    "name": "DATA"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    }
}
```

</details>

<details>
<summary>http://localhost:2019/useremails/useremail/8888</summary>

```JSON
{
    "timestamp": "2020-03-17T23:31:55.974+0000",
    "status": 500,
    "error": "Internal Server Error",
    "message": "Useremail with id 8888 Not Found!",
    "trace": "javax.persistence.EntityNotFoundException: Useremail with id 8888 Not Found!\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.lambda$findUseremailById$0(UseremailServiceImpl.java:51)\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl.findUseremailById(UseremailServiceImpl.java:51)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$FastClassBySpringCGLIB$$f1b1885e.invoke(<generated>)\n\tat org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:769)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:366)\n\tat org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:99)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)\n\tat org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)\n\tat com.lambdaschool.usermodel.services.UseremailServiceImpl$$EnhancerBySpringCGLIB$$ea467b52.findUseremailById(<generated>)\n\tat com.lambdaschool.usermodel.controllers.UseremailController.getUserEmailById(UseremailController.java:57)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:879)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:634)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:741)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:231)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:53)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:119)\n\tat org.apache.catalina.core.ApplicationFilterChain.internalDoFilter(ApplicationFilterChain.java:193)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:166)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:202)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:96)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:541)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:139)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:92)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:74)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:343)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:367)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:65)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:868)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1639)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:49)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:61)\n\tat java.base/java.lang.Thread.run(Thread.java:834)\n",
    "path": "/useremails/useremail/8888"
}
```

</details>

<details>
<summary>DELETE http://localhost:2019/useremails/useremail/8</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>PUT http://localhost:2019/useremails/useremail/9/email/favbun@hops.local</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>POST http://localhost:2019/useremails/user/15/email/favbun@hops.local</summary>

```TEXT
No Body Data

Location Header: http://localhost:2019/useremails/useremail/65
Status 201 Created
```

</details>

<details>
<summary>http://localhost:2019/useremails/username/cinabun</summary>

```JSON
[
    {
        "useremailid": 86,
        "useremail": "cinnamon@mymail.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    },
    {
        "useremailid": 87,
        "useremail": "hops@mymail.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    },
    {
        "useremailid": 88,
        "useremail": "bunny@email.home",
        "user": {
            "userid": 7,
            "username": "cinabun",
            "primaryemail": "cinabun@lambdaschool.home",
            "roles": []
        }
    }
]
```

</details>

---

<details>
<summary>http://localhost:2019/roles/roles</summary>

```JSON
[
    {
        "roleid": 1,
        "name": "ADMIN",
        "users": [
            {
                "user": {
                    "userid": 4,
                    "username": "admin",
                    "primaryemail": "admin@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 5,
                            "useremail": "admin@email.local"
                        },
                        {
                            "useremailid": 6,
                            "useremail": "admin@mymail.local"
                        }
                    ]
                }
            }
        ]
    },
    {
        "roleid": 2,
        "name": "USER",
        "users": [
            {
                "user": {
                    "userid": 4,
                    "username": "admin",
                    "primaryemail": "admin@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 5,
                            "useremail": "admin@email.local"
                        },
                        {
                            "useremailid": 6,
                            "useremail": "admin@mymail.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 7,
                    "username": "cinnamon",
                    "primaryemail": "cinnamon@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 9,
                            "useremail": "favbun@hops.local"
                        },
                        {
                            "useremailid": 10,
                            "useremail": "bunny@email.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 11,
                    "username": "barnbarn",
                    "primaryemail": "barnbarn@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 12,
                            "useremail": "barnbarn@email.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 13,
                    "username": "puttat",
                    "primaryemail": "puttat@school.lambda",
                    "useremails": []
                }
            },
            {
                "user": {
                    "userid": 14,
                    "username": "misskitty",
                    "primaryemail": "misskitty@school.lambda",
                    "useremails": []
                }
            },
            {
                "user": {
                    "userid": 15,
                    "username": "elmer.powlowski",
                    "primaryemail": "johnie.mayer@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 16,
                            "useremail": "vfvo46@gmail.com"
                        },
                        {
                            "useremailid": 65,
                            "useremail": "favbun@hops.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 17,
                    "username": "lonnie.monahan",
                    "primaryemail": "jo.kemmer@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 18,
                            "useremail": "puii03@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 19,
                    "username": "rod.rolfson",
                    "primaryemail": "cathy.bernhard@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 20,
                            "useremail": "ejxs87@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 21,
                    "username": "elisha.waters",
                    "primaryemail": "emanuel.mckenzie@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 22,
                            "useremail": "ypzy48@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 23,
                    "username": "reba.paucek",
                    "primaryemail": "dena.baumbach@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 24,
                            "useremail": "abij95@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 25,
                    "username": "dana.abbott",
                    "primaryemail": "ming.rowe@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 26,
                            "useremail": "gfzq84@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 27,
                    "username": "luis.schroeder",
                    "primaryemail": "wyatt.rath@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 28,
                            "useremail": "nuyd99@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 29,
                    "username": "darlena.hintz",
                    "primaryemail": "hedy.douglas@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 30,
                            "useremail": "mumw32@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 31,
                    "username": "devon.gislason",
                    "primaryemail": "cruz.kautzer@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 32,
                            "useremail": "gkns62@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 33,
                    "username": "earlie.feil",
                    "primaryemail": "randy.roberts@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 34,
                            "useremail": "cvsb59@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 35,
                    "username": "bernetta.botsford",
                    "primaryemail": "clayton.hamill@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 36,
                            "useremail": "xklj91@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 37,
                    "username": "quintin.kertzmann",
                    "primaryemail": "jeniffer.treutel@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 38,
                            "useremail": "khql44@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 39,
                    "username": "lovetta.ratke",
                    "primaryemail": "elvis.kutch@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 40,
                            "useremail": "etcd27@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 41,
                    "username": "brent.predovic",
                    "primaryemail": "orville.purdy@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 42,
                            "useremail": "ztcs89@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 43,
                    "username": "lillian.bednar",
                    "primaryemail": "lucien.schroeder@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 44,
                            "useremail": "zmzo62@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 45,
                    "username": "kathi.watsica",
                    "primaryemail": "margarito.hickle@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 46,
                            "useremail": "biad66@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 47,
                    "username": "gilberto.bahringer",
                    "primaryemail": "merle.williamson@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 48,
                            "useremail": "hopg63@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 49,
                    "username": "rickie.kovacek",
                    "primaryemail": "laine.stehr@hotmail.com",
                    "useremails": [
                        {
                            "useremailid": 50,
                            "useremail": "qont54@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 51,
                    "username": "tashia.breitenberg",
                    "primaryemail": "abdul.cummerata@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 52,
                            "useremail": "xvvk90@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 53,
                    "username": "vanessa.stamm",
                    "primaryemail": "alda.ratke@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 54,
                            "useremail": "rbry74@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 55,
                    "username": "christia.ondricka",
                    "primaryemail": "carola.roob@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 56,
                            "useremail": "gilg74@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 57,
                    "username": "twana.mcclure",
                    "primaryemail": "josiah.douglas@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 58,
                            "useremail": "muon24@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 59,
                    "username": "john.effertz",
                    "primaryemail": "corrin.murphy@gmail.com",
                    "useremails": [
                        {
                            "useremailid": 60,
                            "useremail": "kfxq64@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 61,
                    "username": "rogelio.vonrueden",
                    "primaryemail": "joyce.connelly@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 62,
                            "useremail": "eybv29@gmail.com"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 63,
                    "username": "douglass.schumm",
                    "primaryemail": "priscilla.jacobson@yahoo.com",
                    "useremails": [
                        {
                            "useremailid": 64,
                            "useremail": "dgpt49@gmail.com"
                        }
                    ]
                }
            }
        ]
    },
    {
        "roleid": 3,
        "name": "DATA",
        "users": [
            {
                "user": {
                    "userid": 4,
                    "username": "admin",
                    "primaryemail": "admin@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 5,
                            "useremail": "admin@email.local"
                        },
                        {
                            "useremailid": 6,
                            "useremail": "admin@mymail.local"
                        }
                    ]
                }
            },
            {
                "user": {
                    "userid": 7,
                    "username": "cinnamon",
                    "primaryemail": "cinnamon@lambdaschool.local",
                    "useremails": [
                        {
                            "useremailid": 9,
                            "useremail": "favbun@hops.local"
                        },
                        {
                            "useremailid": 10,
                            "useremail": "bunny@email.local"
                        }
                    ]
                }
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/roles/role/3</summary>

```JSON
{
    "roleid": 3,
    "name": "DATA",
    "users": [
        {
            "user": {
                "userid": 4,
                "username": "admin",
                "primaryemail": "admin@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 5,
                        "useremail": "admin@email.local"
                    },
                    {
                        "useremailid": 6,
                        "useremail": "admin@mymail.local"
                    }
                ]
            }
        },
        {
            "user": {
                "userid": 7,
                "username": "cinnamon",
                "primaryemail": "cinnamon@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 9,
                        "useremail": "favbun@hops.local"
                    },
                    {
                        "useremailid": 10,
                        "useremail": "bunny@email.local"
                    }
                ]
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/roles/role/name/data</summary>

```JSON
{
    "roleid": 3,
    "name": "DATA",
    "users": [
        {
            "user": {
                "userid": 4,
                "username": "admin",
                "primaryemail": "admin@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 5,
                        "useremail": "admin@email.local"
                    },
                    {
                        "useremailid": 6,
                        "useremail": "admin@mymail.local"
                    }
                ]
            }
        },
        {
            "user": {
                "userid": 7,
                "username": "cinnamon",
                "primaryemail": "cinnamon@lambdaschool.local",
                "useremails": [
                    {
                        "useremailid": 9,
                        "useremail": "favbun@hops.local"
                    },
                    {
                        "useremailid": 10,
                        "useremail": "bunny@email.local"
                    }
                ]
            }
        }
    ]
}
```

</details>

<details>
<summary>POST http://localhost:2019/roles/role</summary>

DATA

```JSON
{
    "name" : "ANewRole"
}
```

OUTPUT

```TEXT
No Body Data

Location Header: http://localhost:2019/roles/role/66
Status 201 Created
```

</details>

<details>
<summary>DELETE localhost:2019/roles/role/3</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>PUT http://localhost:2019/roles/role/66</summary>

DATA

```JSON
{
    "name" : "CORGI"
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>PATCH http://localhost:2019/roles/role/66</summary>

DATA

```JSON
{
    "name" : "MOJO"
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

---

<details>
<summary>http://localhost:2019/users/users</summary>

```JSON
[
    {
        "userid": 4,
        "username": "admin",
        "primaryemail": "admin@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 5,
                "useremail": "admin@email.local"
            },
            {
                "useremailid": 6,
                "useremail": "admin@mymail.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 1,
                    "name": "ADMIN"
                }
            },
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 7,
        "username": "cinnamon",
        "primaryemail": "cinnamon@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 9,
                "useremail": "favbun@hops.local"
            },
            {
                "useremailid": 10,
                "useremail": "bunny@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 11,
        "username": "barnbarn",
        "primaryemail": "barnbarn@lambdaschool.local",
        "useremails": [
            {
                "useremailid": 12,
                "useremail": "barnbarn@email.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 13,
        "username": "puttat",
        "primaryemail": "puttat@school.lambda",
        "useremails": [],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 14,
        "username": "misskitty",
        "primaryemail": "misskitty@school.lambda",
        "useremails": [],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 15,
        "username": "elmer.powlowski",
        "primaryemail": "johnie.mayer@hotmail.com",
        "useremails": [
            {
                "useremailid": 16,
                "useremail": "vfvo46@gmail.com"
            },
            {
                "useremailid": 65,
                "useremail": "favbun@hops.local"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 17,
        "username": "lonnie.monahan",
        "primaryemail": "jo.kemmer@yahoo.com",
        "useremails": [
            {
                "useremailid": 18,
                "useremail": "puii03@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 19,
        "username": "rod.rolfson",
        "primaryemail": "cathy.bernhard@gmail.com",
        "useremails": [
            {
                "useremailid": 20,
                "useremail": "ejxs87@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 21,
        "username": "elisha.waters",
        "primaryemail": "emanuel.mckenzie@yahoo.com",
        "useremails": [
            {
                "useremailid": 22,
                "useremail": "ypzy48@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 23,
        "username": "reba.paucek",
        "primaryemail": "dena.baumbach@gmail.com",
        "useremails": [
            {
                "useremailid": 24,
                "useremail": "abij95@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 25,
        "username": "dana.abbott",
        "primaryemail": "ming.rowe@hotmail.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "gfzq84@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 27,
        "username": "luis.schroeder",
        "primaryemail": "wyatt.rath@hotmail.com",
        "useremails": [
            {
                "useremailid": 28,
                "useremail": "nuyd99@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 29,
        "username": "darlena.hintz",
        "primaryemail": "hedy.douglas@yahoo.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "mumw32@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 31,
        "username": "devon.gislason",
        "primaryemail": "cruz.kautzer@yahoo.com",
        "useremails": [
            {
                "useremailid": 32,
                "useremail": "gkns62@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 33,
        "username": "earlie.feil",
        "primaryemail": "randy.roberts@hotmail.com",
        "useremails": [
            {
                "useremailid": 34,
                "useremail": "cvsb59@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 35,
        "username": "bernetta.botsford",
        "primaryemail": "clayton.hamill@hotmail.com",
        "useremails": [
            {
                "useremailid": 36,
                "useremail": "xklj91@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 37,
        "username": "quintin.kertzmann",
        "primaryemail": "jeniffer.treutel@gmail.com",
        "useremails": [
            {
                "useremailid": 38,
                "useremail": "khql44@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 39,
        "username": "lovetta.ratke",
        "primaryemail": "elvis.kutch@hotmail.com",
        "useremails": [
            {
                "useremailid": 40,
                "useremail": "etcd27@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 41,
        "username": "brent.predovic",
        "primaryemail": "orville.purdy@hotmail.com",
        "useremails": [
            {
                "useremailid": 42,
                "useremail": "ztcs89@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 43,
        "username": "lillian.bednar",
        "primaryemail": "lucien.schroeder@hotmail.com",
        "useremails": [
            {
                "useremailid": 44,
                "useremail": "zmzo62@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 45,
        "username": "kathi.watsica",
        "primaryemail": "margarito.hickle@gmail.com",
        "useremails": [
            {
                "useremailid": 46,
                "useremail": "biad66@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 47,
        "username": "gilberto.bahringer",
        "primaryemail": "merle.williamson@gmail.com",
        "useremails": [
            {
                "useremailid": 48,
                "useremail": "hopg63@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 49,
        "username": "rickie.kovacek",
        "primaryemail": "laine.stehr@hotmail.com",
        "useremails": [
            {
                "useremailid": 50,
                "useremail": "qont54@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 51,
        "username": "tashia.breitenberg",
        "primaryemail": "abdul.cummerata@gmail.com",
        "useremails": [
            {
                "useremailid": 52,
                "useremail": "xvvk90@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 53,
        "username": "vanessa.stamm",
        "primaryemail": "alda.ratke@yahoo.com",
        "useremails": [
            {
                "useremailid": 54,
                "useremail": "rbry74@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 55,
        "username": "christia.ondricka",
        "primaryemail": "carola.roob@gmail.com",
        "useremails": [
            {
                "useremailid": 56,
                "useremail": "gilg74@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 57,
        "username": "twana.mcclure",
        "primaryemail": "josiah.douglas@yahoo.com",
        "useremails": [
            {
                "useremailid": 58,
                "useremail": "muon24@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 59,
        "username": "john.effertz",
        "primaryemail": "corrin.murphy@gmail.com",
        "useremails": [
            {
                "useremailid": 60,
                "useremail": "kfxq64@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 61,
        "username": "rogelio.vonrueden",
        "primaryemail": "joyce.connelly@yahoo.com",
        "useremails": [
            {
                "useremailid": 62,
                "useremail": "eybv29@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 63,
        "username": "douglass.schumm",
        "primaryemail": "priscilla.jacobson@yahoo.com",
        "useremails": [
            {
                "useremailid": 64,
                "useremail": "dgpt49@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/users/user/7</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/cinnamon</summary>

```JSON
{
    "userid": 7,
    "username": "cinnamon",
    "primaryemail": "cinnamon@lambdaschool.local",
    "useremails": [
        {
            "useremailid": 9,
            "useremail": "favbun@hops.local"
        },
        {
            "useremailid": 10,
            "useremail": "bunny@email.local"
        }
    ],
    "roles": [
        {
            "role": {
                "roleid": 2,
                "name": "USER"
            }
        }
    ]
}
```

</details>

<details>
<summary>http://localhost:2019/users/user/name/like/da</summary>

```JSON
[
    {
        "userid": 25,
        "username": "dana.abbott",
        "primaryemail": "ming.rowe@hotmail.com",
        "useremails": [
            {
                "useremailid": 26,
                "useremail": "gfzq84@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    },
    {
        "userid": 29,
        "username": "darlena.hintz",
        "primaryemail": "hedy.douglas@yahoo.com",
        "useremails": [
            {
                "useremailid": 30,
                "useremail": "mumw32@gmail.com"
            }
        ],
        "roles": [
            {
                "role": {
                    "roleid": 2,
                    "name": "USER"
                }
            }
        ]
    }
]
```

</details>

<details>
<summary>POST http://localhost:2019/users/user</summary>

DATA

```JSON
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "password" : "Coffee123",
    "useremails": [
        {
            "useremail": "mojo@mymail.local"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "roleid": 2
            }
        }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Location Header: http://localhost:2019/users/user/67
Status 201 Created
```

</details>

<details>
<summary>PUT http://localhost:2019/users/user/15</summary>

DATA

```JSON
{
    "username": "stubs",
    "primaryemail": "stubs@lambdaschool.local",
    "password" : "EarlGray123",
    "useremails": [
        {
            "useremail": "stubs@mymail.local"
        },
        {
            "useremail": "stubs@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 66
            }
        }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>PATCH http://localhost:2019/users/user/7</summary>

DATA

```JSON
{
    "username": "cinabun",
    "primaryemail": "cinabun@lambdaschool.home",
    "useremails": [
    {
            "useremail": "cinnamon@mymail.home"
    },
    {
            "useremail": "hops@mymail.home"
    },
    {
            "useremail": "bunny@email.home"
    }
    ]
}
```

OUTPUT

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/14</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>http://localhost:2019/users/user/email/count</summary>

```JSON
[
    {
        "usernamerpt": "admin",
        "countemails": 2
    },
    {
        "usernamerpt": "barnbarn",
        "countemails": 1
    },
    {
        "usernamerpt": "bernetta.botsford",
        "countemails": 1
    },
    {
        "usernamerpt": "brent.predovic",
        "countemails": 1
    },
    {
        "usernamerpt": "christia.ondricka",
        "countemails": 1
    },
    {
        "usernamerpt": "cinabun",
        "countemails": 3
    },
    {
        "usernamerpt": "dana.abbott",
        "countemails": 1
    },
    {
        "usernamerpt": "darlena.hintz",
        "countemails": 1
    },
    {
        "usernamerpt": "devon.gislason",
        "countemails": 1
    },
    {
        "usernamerpt": "douglass.schumm",
        "countemails": 1
    },
    {
        "usernamerpt": "earlie.feil",
        "countemails": 1
    },
    {
        "usernamerpt": "elisha.waters",
        "countemails": 1
    },
    {
        "usernamerpt": "gilberto.bahringer",
        "countemails": 1
    },
    {
        "usernamerpt": "john.effertz",
        "countemails": 1
    },
    {
        "usernamerpt": "kathi.watsica",
        "countemails": 1
    },
    {
        "usernamerpt": "lillian.bednar",
        "countemails": 1
    },
    {
        "usernamerpt": "lonnie.monahan",
        "countemails": 1
    },
    {
        "usernamerpt": "lovetta.ratke",
        "countemails": 1
    },
    {
        "usernamerpt": "luis.schroeder",
        "countemails": 1
    },
    {
        "usernamerpt": "mojo",
        "countemails": 2
    },
    {
        "usernamerpt": "quintin.kertzmann",
        "countemails": 1
    },
    {
        "usernamerpt": "reba.paucek",
        "countemails": 1
    },
    {
        "usernamerpt": "rickie.kovacek",
        "countemails": 1
    },
    {
        "usernamerpt": "rod.rolfson",
        "countemails": 1
    },
    {
        "usernamerpt": "rogelio.vonrueden",
        "countemails": 1
    },
    {
        "usernamerpt": "stubs",
        "countemails": 2
    },
    {
        "usernamerpt": "tashia.breitenberg",
        "countemails": 1
    },
    {
        "usernamerpt": "twana.mcclure",
        "countemails": 1
    },
    {
        "usernamerpt": "vanessa.stamm",
        "countemails": 1
    }
]
```

</details>

<details>
<summary>DELETE http://localhost:2019/users/user/7/role/2</summary>

```TEXT
No Body Data

Status OK
```

</details>

<details>
<summary>POST http://localhost:2019/users/user/15/role/1</summary>

```TEXT
No Body Data

No Location Header
Status 201 Created
```

</details>

---

### Expand each section below to see the results of exception handling

<details>
<summary>ID not found http://localhost:2019/useremails/useremail/8888</summary>

```JSON
{
    "title": "Resource Not Found",
    "status": 404,
    "detail": "Error from a Lambda School Application Useremail with id 8888 Not Found!",
    "timestamp": "2020-04-24 14:50:31",
    "developerMessage": "com.lambdaschool.usermodel.exceptions.ResourceNotFoundException",
    "errors": []
}
```

</details>

<details>
<summary>Adding a duplicate http://localhost:2019/roles/role</summary>

DATA

```JSON
{
    "name" : "DATA"
}```

OUTPUT

```JSON
{
    "title": "Internal Server Error",
    "status": 500,
    "detail": "could not execute statement; SQL [n/a]; constraint [\"PUBLIC.UK_OFX66KERUAPI6VYQPV6F2OR37_INDEX_4 ON PUBLIC.ROLES(NAME) VALUES 3\"; SQL statement:\ninsert into roles (created_by, created_date, last_modified_by, last_modified_date, name, roleid) values (?, ?, ?, ?, ?, ?) [23505-200]]; nested exception is org.hibernate.exception.ConstraintViolationException: could not execute statement",
    "timestamp": "2020-04-24 14:51:12",
    "developerMessage": "path: /roles/role",
    "errors": []
}
```

</details>

<details>
<summary>Resource Found POST http://localhost:2019/users/user/15/role/1</summary>

```JSON
{
    "title": "Unexpected Resource",
    "status": 400,
    "detail": "Error from a Lambda School Application Role and User Combination Already Exists",
    "timestamp": "2020-04-24 14:54:25",
    "developerMessage": "com.lambdaschool.usermodel.exceptions.ResourceFoundException",
    "errors": []
}
```

</details>

<details>
<summary>Missing From JSON POST http://localhost:2019/users/user</summary>

DATA

```JSON
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "useremails": [
        {
            "useremail": "mojo@mymail.local"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "roleid": 2
            }
        }
    ]
}
```

```JSON
{
    "title": "Method Argument Not Valid",
    "status": 400,
    "detail": "uri=/users/user | parameter: method 'addNewUser' parameter 0",
    "timestamp": "2020-04-24 14:56:21",
    "developerMessage": "org.springframework.validation.BeanPropertyBindingResult: 1 errors\nField error in object 'user' on field 'password': rejected value [null]; codes [NotNull.user.password,NotNull.password,NotNull.java.lang.String,NotNull]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [user.password,password]; arguments []; default message [password]]; default message [must not be null]",
    "errors": []
}
```

</details>

<details>
<summary>Email Wrong Format POST http://localhost:2019/users/user</summary>

DATA

```JSON
{
    "username": "Mojo",
    "primaryemail": "mojo@lambdaschool.local",
    "password" : "Coffee123",
    "useremails": [
        {
            "useremail": "mojol"
        },
        {
            "useremail": "mojo@email.local"
        }
        ],
    "roles": [
        {
            "role": {
                "roleid": 1
            }
        },
        {
            "role": {
                "roleid": 2
            }
        }
    ]
}

```

OUTPUT

```JSON
{
    "title": "Internal Server Error",
    "status": 500,
    "detail": "Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction",
    "timestamp": "2020-04-24 14:58:45",
    "developerMessage": "path: /users/user",
    "errors": [
        {
            "message": "must be a well-formed email address",
            "code": "mojol"
        }
    ]
}
```

</details>

<details>
<summary>Wrong Method GET http://localhost:2019/users/user</summary>

```JSON
{
    "title": "Incorrect method: GET",
    "status": 405,
    "detail": "Path: uri=/users/user | Supported Methods are: [POST]",
    "timestamp": "2020-04-24 14:59:59",
    "developerMessage": "HTTP Method Not Valid for Endpoint (check for valid URI and proper HTTP Method)",
    "errors": []
}
```

</details>

<details>
<summary>Invalid endpoint http://localhost:2019/turtle</summary>

```JSON
{
    "title": "Rest Endpoint Not Valid",
    "status": 404,
    "detail": "uri=/turtle",
    "timestamp": "2020-04-24 15:00:59",
    "developerMessage": "Rest Handler Not Found (check for valid URI)",
    "errors": []
}
```

</details>

### Click on the link below to see a PDF of the Custom Swagger Documentation

[Google Drive - Custom Swagger Documentation](https://drive.google.com/open?id=1NpAN_75hFnCjDVHJP-4-Qvp1FztbpD2m)
