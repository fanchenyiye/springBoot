package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.CustomerMapper;
import com.service.ITestCustomerService;
import com.utils.StringUtils;
import com.vo.Customer;

@Service
public class TestCustomerServiceImpl implements ITestCustomerService {

	@Resource
	private CustomerMapper custMapper;
	@Override
	public Customer findById(String id) {
		if (StringUtils.isEmpty(id)) {
			return null;
		}
		return custMapper.findById(id);
	}

}
