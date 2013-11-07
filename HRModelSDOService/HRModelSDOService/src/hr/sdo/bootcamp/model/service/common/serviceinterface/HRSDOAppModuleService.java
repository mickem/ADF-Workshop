package hr.sdo.bootcamp.model.service.common.serviceinterface;

import hr.sdo.bootcamp.model.views.common.SdoDepartmentsViewSDO;
import hr.sdo.bootcamp.model.views.common.SdoEmployeesViewSDO;
import hr.sdo.bootcamp.model.views.common.SdoJobsViewSDO;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Nov 07 11:19:51 CET 2013
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace="/hr/sdo/bootcamp/model/service/common/", name="HRSDOAppModuleService",
    wsdlLocation="hr/sdo/bootcamp/model/service/common/serviceinterface/HRSDOAppModuleService.wsdl")
@SDODatabinding(schemaLocation="hr/sdo/bootcamp/model/service/common/serviceinterface/HRSDOAppModuleService.xsd")
public interface HRSDOAppModuleService {


    public static final String NAME = "{/hr/sdo/bootcamp/model/service/common/}HRSDOAppModuleService";

    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/updateSdoAllDepartments", operationName="updateSdoAllDepartments")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="updateSdoAllDepartments")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="updateSdoAllDepartmentsResponse")
    @WebResult(name="result")
    SdoDepartmentsViewSDO updateSdoAllDepartments(@WebParam(mode = WebParam.Mode.IN, name="sdoAllDepartments")
        SdoDepartmentsViewSDO sdoAllDepartments) throws ServiceException;

    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/findSdoAllDepartments", operationName="findSdoAllDepartments")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllDepartments")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllDepartmentsResponse")
    @WebResult(name="result")
    List<SdoDepartmentsViewSDO> findSdoAllDepartments(@WebParam(mode = WebParam.Mode.IN, name="findCriteria")
        FindCriteria findCriteria, @WebParam(mode = WebParam.Mode.IN, name="findControl")
        FindControl findControl) throws ServiceException;


    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/findSdoAllEmpoyees", operationName="findSdoAllEmpoyees")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllEmpoyees")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllEmpoyeesResponse")
    @WebResult(name="result")
    List<SdoEmployeesViewSDO> findSdoAllEmpoyees(@WebParam(mode = WebParam.Mode.IN, name="findCriteria")
        FindCriteria findCriteria, @WebParam(mode = WebParam.Mode.IN, name="findControl")
        FindControl findControl) throws ServiceException;

    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/findSdoAllJobs", operationName="findSdoAllJobs")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllJobs")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="findSdoAllJobsResponse")
    @WebResult(name="result")
    List<SdoJobsViewSDO> findSdoAllJobs(@WebParam(mode = WebParam.Mode.IN, name="findCriteria")
        FindCriteria findCriteria, @WebParam(mode = WebParam.Mode.IN, name="findControl")
        FindControl findControl) throws ServiceException;

    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/getSdoDepartmentByKey", operationName="getSdoDepartmentByKey")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="getSdoDepartmentByKey")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="getSdoDepartmentByKeyResponse")
    @WebResult(name="result")
    SdoDepartmentsViewSDO getSdoDepartmentByKey(@WebParam(mode = WebParam.Mode.IN, name="departmentId")
        Integer departmentId) throws ServiceException;

    @WebMethod(action="/hr/sdo/bootcamp/model/service/common/getSdoEmployeeByKey", operationName="getSdoEmployeeByKey")
    @RequestWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="getSdoEmployeeByKey")
    @ResponseWrapper(targetNamespace="/hr/sdo/bootcamp/model/service/common/types/", localName="getSdoEmployeeByKeyResponse")
    @WebResult(name="result")
    SdoEmployeesViewSDO getSdoEmployeeByKey(@WebParam(mode = WebParam.Mode.IN, name="employeeId")
        Integer employeeId) throws ServiceException;
}