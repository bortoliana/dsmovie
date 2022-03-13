import {ReactComponent as GithubIcon} from 'assets/img/github.svg'
import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>
                        <a href="https://dsmovieana.netlify.app/" rel="noreferrer">DSMovie</a>
                    </h1>
                    <a href="https://github.com/bortoliana" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/bortoliana</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default Navbar;