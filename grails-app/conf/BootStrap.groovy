class BootStrap {
    def grailsApplication
    def reportUtilsService


    def init = { servletContext ->
        initReports(servletContext)
    }

    private void initReports(def servletContext) {
        log.debug ("init reports")
        def reports = [
                [title: "exampleReportTitle", hook: "exampleReportHook"],
        ]

        reportUtilsService.verifyReports(reports, servletContext)
    }


    def destroy = {
        // nothing to destroy
    }
} 