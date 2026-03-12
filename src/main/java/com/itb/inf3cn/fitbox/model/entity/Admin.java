package com.itb.inf3cn.fitbox.model.entity;

import jakarta.persistence.Entity;

@Entity

public class Admin extends Usuario {

    private String nivelAcesso;
}
