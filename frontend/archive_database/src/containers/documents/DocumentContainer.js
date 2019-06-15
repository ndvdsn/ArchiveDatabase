import React from "react";
import Request from "../../helpers/request";


class DocumentContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      documents:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/documents')
    then(data => {
      this.setState({documents:data._embedded.documents})
    })
  }
  render(){
    return (
      <>
      <h1> Documents </h1>
      <div className = "documents-container">
      <DocumentList documentlist={this.state.documents}/>
      </div>
      </>
    )
  }
}
export default DocumentContainer;
