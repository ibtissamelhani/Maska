<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>maska</title>
      <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body>
 <section class="flex items-center justify-center h-screen">
 <div class="overflow-x-auto">
   <table class="min-w-full divide-y-2 divide-gray-200 bg-white text-sm">
     <thead class="ltr:text-left rtl:text-right">
       <tr>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">id</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">membership_number</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">first_name</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">last_name</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">piece_identification</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">nationality</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">membership_date</th>
         <th class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">license_expiration_date</th>
       </tr>
     </thead>

     <tbody class="divide-y divide-gray-200">
       <c:forEach var="member" items="${members}">
       <tr class="odd:bg-gray-50">
         <td class="whitespace-nowrap px-4 py-2 font-medium text-gray-900">${member.id}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.membershipNumber}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.firstName}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.lastName}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.pieceIdentification}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.nationality}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.membershipDate}</td>
         <td class="whitespace-nowrap px-4 py-2 text-gray-700">${member.licenseExpirationDate}</td>
       </tr>
       </c:forEach>
     </tbody>
   </table>
 </div>
 </section>
  </body>
</html>
