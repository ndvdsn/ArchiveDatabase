import React from "react";
import Request from "../../helpers/request";
import PermissionList from "../../components/permissions/PermissionList";

class PermissionContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      permissions:[]
    }
  }

  componentDidMount(){
    const request = new Request();
    request.get('/api/permissions')
    .then(data => {
      this.setState({permissions:data._embedded.permissions})
    })
  }

  render(){
    console.log(this.state.permissions);
    return (
      <>
      <h1> Permissions </h1>
      <div className = "permission-container">
      <PermissionList permissions={this.state.permissions}
      />
      </div>
      </>
    )
  }
}
export default PermissionContainer;
