import React from 'react'
import image2 from '../Images/image2.png'
import './styles/footer_style.css'

export default function Footer() {
  return (
    <div className='row'>
      <img src={image2} className='img-thumbnail img-fluid col-8 footer_image'/>
      <div className='d-flex flex-wrap mx-auto col-12 m-5'>
        <a href='' className='m-2'>Facebook</a>
        <a href='' className='m-2'>Instagram</a>
        <a href='' className='m-2'>Twitter</a>
      </div>
    </div>
  )
}
