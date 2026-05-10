<h1>Enrollments</h1>

<table border="1">

<tr>
<th>Student</th>
<th>Course</th>
<th>Grade</th>
<th>Delete</th>
</tr>

<g:each in="${enrollments}" var="e">

<tr>

<td>${e.student.name}</td>
<td>${e.course.title}</td>
<td>${e.grade}</td>

<td>

<g:link
action="delete"
id="${e.id}"
onclick="return confirm('Delete?')">

Delete

</g:link>

</td>

</tr>

</g:each>

</table>
