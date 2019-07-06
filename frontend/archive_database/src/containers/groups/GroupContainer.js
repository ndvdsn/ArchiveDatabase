import React from "react";
import Request from "../../helpers/request";
import GroupList from "../../components/groups/GroupList";

class GroupContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      groups:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/groups')
    .then(data => {
      this.setState({groups:data._embedded.groups})
    })
  }

  render(){
    console.log(this.state.groups);
    return (
      <>
      <h1> Groups </h1>
      <div className = "groups-container">
      <GroupList groups={this.state.groups}/>
      </div>
      </>
    )
  }
}

export default GroupContainer;
