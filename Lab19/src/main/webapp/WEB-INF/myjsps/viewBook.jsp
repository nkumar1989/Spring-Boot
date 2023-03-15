<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <head>
            <title>JLC Bookstore</title>
            <!--link href="/META-INF/resources/webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet"-->
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
                integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        </head>

        <body>
            <div class="card-header">
                <h2 class="text-center">Welcome to JLC Bookstore</h2>
                <h4 class="text-center"> Best Books and Best Videos</h4>
            </div>
            <br /><br />
            <div class="container">
                <table class="table table-striped table-bordered" style="font-size:20px;font-weight:bold;">
                    <tr>
                        <td align="center" colspan="3"> Book Details</td>
                    </tr>
                    <tr>
                        <td> Book Id</td>
                        <td> ${MyBook.bid} </td>
                    </tr>
                    <tr>
                        <td> Book Name</td>
                        <td> ${MyBook.bname} </td>
                    </tr>
                    <tr>
                        <td>Author</td>
                        <td> ${MyBook.author} </td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td>${MyBook.price} </td>
                    </tr>
                    <tr>
                        <td>Category</td>
                        <td>${MyBook.category} </td>
                    </tr>
                    <tr>
                        <td>Publications</td>
                        <td>${MyBook.pub} </td>
                    </tr>
                    </table>
                    </div>
                    <div align="center">
                        <h2> <a href="showAllBooks">Goto Book Home</a> </h2>
                    </div>
                    </body>
                    
                    </html>