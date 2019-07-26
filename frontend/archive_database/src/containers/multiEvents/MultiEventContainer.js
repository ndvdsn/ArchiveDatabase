import React from "react";
import Request from "../../helpers/request";
import MultiEventList from "../../components/multiEvents/MultiEventList"


class MultiEventContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      multiEvents:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('/api/multiEvents')
    .then(data => {
      this.setState({multiEvents:data._embedded.multiEvents})
    })
  }

  render(){
    console.log(this.state.multiEvents);
    return (
      <>
      <h1> MultiEvents </h1>
      <div className = "multiEvents-container">
      <MultiEventList
      multiEvents={this.state.multiEvents}

      />
      </div>
      </>
    )
  }
}
export default MultiEventContainer;
