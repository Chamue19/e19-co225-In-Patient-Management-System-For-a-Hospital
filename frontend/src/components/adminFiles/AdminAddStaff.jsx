import React, { useState } from 'react';
import Navbar from "./Navbar";
import AddStaffForm from "./AddStaffForm";
import AdminSideBar from "./AdminSideBar";

function AdminAddStaff(props) {


  return (
    <>
      <div className="flex">
        <AdminSideBar isMobile = {props}/>
        <div className="h-screen flex-1 p-7 ">


          <AddStaffForm />
        </div>
      </div>
    </>
  );
};

export default AdminAddStaff;