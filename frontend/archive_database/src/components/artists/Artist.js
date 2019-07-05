import React from "react";
// import moment from "moment";


const Artist = (props) => {

  if(!props.artist){
    return null;
  }


  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })

  const time = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.time
  })
  // const slicedDate = dateBasic.slice(0,10)
  //
  // const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
  // const time = moment(slicedDate).format('hh:mm z','Europe/London');

  const id = props.artist.id

  const groups = props.artist.groups.map((group, index)=>{
    return <ul key={index}>{group.name}</ul>
  })

  const singleEvent = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.title}</ul>

  })

  const location = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.location}</ul>
  })

  const venue = props.artist.singleEvents.map((singleEvent, index) => {
    return <ul key={index}>{singleEvent.venue}</ul>
  })

  return(
    <div className = "single-artist">
      <div className="details">
      <ul>
        <div>
        <li><a href={'/artists/'+id}>{props.artist.name}</a></li>
        </div>
        <div>
        <li>Name: {props.artist.name}</li>
        </div>
        <div>
        <li>Country: {props.artist.country}</li>
        </div>
        <div>
        <li>Groups: {groups}</li>
        </div>
        <div>
        <li>Single Event Title: {singleEvent}</li>
        </div>
        <div>
        <li>Date: {dateBasic}</li>
        </div>
        <div>
        <li>Time: {time}</li>
        </div>
        <div>
        <li>Location: {location}</li>
        </div>
        <div>
        <li>Venue: {venue}</li>
        </div>
      </ul>
      </div>
    </div>
  )
}
export default Artist;
