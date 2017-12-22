package com.app.client;

import java.util.Date;
import java.util.List;

import com.app.client.entity.Mobile;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface MobileRestClient {

	static final String POST = "POST ";
	static final String PUT = "PUT ";
	static final String DELETE = "DELETE ";
	static final String GET = "GET ";

	static final String CREATE_MOBILE = POST + "/create";
	static final String UPDATE_MOBILE = PUT + "/update/{id}";
	static final String DELETE_MOBILE = DELETE + "/delete/{id}";
	static final String GetAllMobile = GET + "/all";
	static final String FIND_BY_ID_MOBILE = GET + "/{id}";
	static final String GET_BY_NAME_ClIENT = GET + "/name/{nameClient}";
	static final String GET_BY_IMEI = GET + "/imei/{imei}";
	static final String GET_BY_MODEL = GET + "/model/{model}";
	static final String GET_BY_DATE = GET + "/date/{date}";
	static final String GET_BY_PANNE = GET + "/panne/{panne}";

	@Headers("Content-Type:application/json")
	@RequestLine(CREATE_MOBILE)
	public Mobile CreateMobile(Mobile mobile);

	@Headers("Content-Type:application/json")
	@RequestLine(UPDATE_MOBILE)
	public Mobile UpdateMobile(Mobile mobile);

	@RequestLine(GetAllMobile)
	public List<Mobile> GetAllMobile();

	@RequestLine(DELETE_MOBILE)
	public void DeletMobile(@Param(value = "id") Long id);

	@RequestLine(FIND_BY_ID_MOBILE)
	public Mobile getById(@Param(value = "id") Long id);

	@RequestLine(GET_BY_NAME_ClIENT)
	public List<Mobile> getByNameClient(@Param(value = "nameClient") String name);

	@RequestLine(GET_BY_IMEI)
	public List<Mobile> getByimei(@Param(value = "imei") String imei);

	@RequestLine(GET_BY_MODEL)
	public List<Mobile> getByModel(@Param(value = "model") String model);

	@RequestLine(GET_BY_DATE)
	public List<Mobile> getByDate(@Param(value = "date") Date date);

	@RequestLine(GET_BY_PANNE)
	public List<Mobile> getByPanne(@Param(value = "panne") String panne);

}
