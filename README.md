![GitHub branch checks state](https://img.shields.io/github/checks-status/abhishekmaity/rest-web-services/learner)
![GitHub](https://img.shields.io/github/license/abhishekmaity/rest-web-services)

# REST web service

This a learner repo for REST web service development

## Social Media Application

### REST APIs for **User**
 - Retrieve all Users
   - <code>GET/users</code>
 - Create a User
   - <code>POST/users</code>
 - Retrieve one User
   - <code>GET/users/{id}</code>
 - Delete a User
   - <code>DELETE/users/{id}</code>

### REST APIs for **User Posts**
 - Retrieve all posts for a Users
   - <code>GET/users/posts</code>
 - Create a post for a User
   - <code>POST/users/{id}/posts/</code>
 - Retrieve details of a post
   - <code>GET/users/{id}/posts/{post_id}</code>

## Versioning of REST API

### URI versioning like *Twitter*
- <code>http://localhost:8080/v1/person</code>
- <code>http://localhost:8080/v2/person</code>

### Request Parameter versioning like *Amazon*
- <code>http://localhost:8080/person?version=1</code>

### Custom Header versioning like *Microsoft*
- <code>SAME-URL headers=[X-API-Version=1]</code>
- <code>SAME-URL headers=[X-API-Version=2]</code>

### Media Type versioning (a.k.a "content negotiation" or "accept header") like *GitHub*
- <code>SAME-URL produces=application/vnd.company.app.v1+json</code>
- <code>SAME-URL produces=application/vnd.company.app.v2+json</code>
