package com.miniproject.carrental.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.miniproject.carrental.model.User;

@Repository
public interface Carrepo extends JpaRepository<User,String>
{

}
