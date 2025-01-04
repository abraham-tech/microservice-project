"use client"
import React, { Component } from 'react';
import EmployeeService from "../EmployeeService";

class EmployeeComponents extends Component {
  constructor(props) {
    super(props);
    this.state = {
      employee: {},
      department: {},
      organization: {}
    }
  }

  componentDidMount() {
    EmployeeService.getEmployee().then((response) => {
      this.setState({ employee: response.employee })
      this.setState({ department: response.department })
      this.setState({ organization: response.organization })

      console.log(this.state.employee, this.state.department, this.state.organization)
    })

  }

  render() {
    return (
      <div>

      </div>
    );
  }
}

export default EmployeeComponents;