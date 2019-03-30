<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<HTML>
<BODY>
	Hello, welcome on the river data base.
	<P>
		<STRONG>${message}</STRONG> <STRONG>${name}</STRONG> <STRONG>${a}</STRONG>
		<STRONG>${b}</STRONG>
		<c:forEach var="i" begin="1" end="5"> Element ${i}<br />
		</c:forEach>
		<c:set var="string1" value="This is first String." />
		<c:set var="string2" value="This is second String." />
	<p>Length of String (1) : ${fn:length(string1)}</p>
	<p>Length of String (2) : ${fn:length(string2)}</p>
	<c:if test="${not empty string1}">Not empty</c:if>

</BODY>
</HTML>