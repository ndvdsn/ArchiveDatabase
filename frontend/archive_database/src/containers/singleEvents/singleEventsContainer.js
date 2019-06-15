import React from "react";
import Request from "../../helpers/request";
import SingleEventList from "../../components/singleEvents/SingleEventList";

class SingleEventContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      singleEvents:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/singleEvents')
    .then(data => {
      this.setState({multiEvents:data._embedded.singleEvents})
    })
  }

  render(){
    console.log(this.state.multiEvents);
    return(
      <>
      <h1>Single Events</h1>
      <div className = "singleEvents-container">
      <SingleEventList singleEvents={this.state.multiEvents} />
      </div>
      </>

    )
  }
}

export default SingleEventContainer;
