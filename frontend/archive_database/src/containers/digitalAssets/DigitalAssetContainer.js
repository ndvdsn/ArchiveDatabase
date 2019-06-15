import React from "react";
import Request from "../../helpers/request";
import DigitalAssetList from "../../components/digitalAssets/DigitalAssetList";

class DigitalAssetContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      digitalAssets:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/documents')
    .then(data => {
      this.setState({digitalAssets:data._embedded.digitalAssets})
    })
  }

  render(){
    console.log(this.state.digitalAssets);
    return (
      <>
      <h1> Documents </h1>
      <div className = "digitalAssets-container">
      <DigitalAssetList digitalAssets={this.state.digitalAssets}/>
      </div>
      </>
    )
  }
}
export default DigitalAssetContainer;
