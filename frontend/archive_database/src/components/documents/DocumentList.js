import React from "react";
import Document from "./Document";

const DocumentList = (props) => {

  if (props.documents == null || props.documents.length ===0){
    return <p> loading...</p>
  }

  const documents = props.documents.map((document)=>{
    return(
      <li key = {document.id} className = "document-item">
      <Document document = {document}/>
      </li>
    )
  })

  return (
    <div>
    <ul>
    {documents}
    </ul>
    </div>
  )
};

export default DocumentList
