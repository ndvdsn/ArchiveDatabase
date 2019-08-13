import React from "react";
import Request from "../../helpers/request";
import PhysicalAssetList from "../../components/physicalAssets/PhysicalAssetList";

class PhysicalAssetContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      physicalAssets:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/physicalAssets')
    .then(data => {
      this.setState({physicalAssets:data._embedded.physicalAssets})
      console.log(this.state.physicalAssets);
    })
  }

  render(){
    console.log(this.state.physicalAssets);
    return (
      <>
      <h1> Physical Assets </h1>
      <div className="physicalAssets-container">
      <PhysicalAssetList physicalAssets={this.state.physicalAssets}/>
      </div>
      </>
    )
  }
}

export default PhysicalAssetContainer;
