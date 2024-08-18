<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Tableau de bord</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/logonsia.png" rel="icon">
  <link href="assets/img/logonsia.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="index.php" class="logo d-flex align-items-center">
        <img src="assets/img/logonsia.png" alt="">
        <span class="d-none d-lg-block">  DSID</span>
      </a>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

    <div class="search-bar">
      <form class="search-form d-flex align-items-center" method="POST" action="#">
        <input type="text" name="query" placeholder="Search" title="Rechercher">
        <button type="submit" title="Rechercher"><i class="bi bi-search"></i></button>
      </form>
    </div><!-- End Search Bar -->

    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item d-block d-lg-none">
          <a class="nav-link nav-icon search-bar-toggle " href="#">
            <i class="bi bi-search"></i>
          </a>
        </li><!-- End Search Icon-->

   

        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" >
            
            <span class="d-none d-md-block dropdown-toggle ps-2">ANGE DIBI</span>
          </a><!-- End Profile Iamge Icon -->


        </li><!-- End Profile Nav -->

      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->

  <!-- ======= Sidebar ======= -->
  <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="index.php" >
          <i class="bi bi-grid"></i>
          <span>Tableau de bord</span>
        </a>
      </li><!-- End Dashboard Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-menu-button-wide"></i><span> Gestion Generale</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
         
          <li>
            <a >
              <i class="bi bi-circle"></i><span>Directions</span>
            </a>
          </li>
        
        
          <li>
            <a href="components-utilisateur.php">
              <i class="bi bi-circle"></i><span>Utilisateurs</span>
            </a>
          </li>
          <li>
            <a href="components-materiel.php">
              <i class="bi bi-circle"></i><span>Materiels</span>
            </a>
          </li>
         
        </ul>
      </li><!-- End Components Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#forms-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-journal-text"></i><span>Gestion Interne</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="forms-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
     
        
          <li>
            <a href="forms-habilitation.php">
              <i class="bi bi-circle"></i><span>Habilitations</span>
            </a>
          </li>
          <li>
            <a href="forms-maintenance.php">
              <i class="bi bi-circle"></i><span>Maintenances</span>
            </a>
          </li>

        </ul>
      </li><!-- End Forms Nav -->





          <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#tables-nav" data-bs-toggle="collapse" href="#" aria-expanded="false">
          <i class="bi bi-box-seam"></i><span>Entrepôt</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="tables-nav" class="nav-content collapse" data-bs-parent="#sidebar-nav" style="">
          <li>
            <a href="stock-ajouter.php">
              <i class="bi bi-circle"></i><span>Ajouter</span>
            </a>
          </li>
          <li>
            <a href="stock-supprimer.php">
              <i class="bi bi-circle"></i><span>Supprimer</span>
            </a>
          </li>
        </ul>
      </li>






<pre>
  













</pre>



 <li class="nav-item">
        <a class="nav-link " href="login.php">
          <i class="bi bi-box-arrow-left"></i>
          <span>Se Deconnecter</span>
        </a>
      </li><!-- End Dashboard Nav -->

    </ul>

  </aside><!-- End Sidebar-->

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Directions</h1>
      <nav>
        <ol class="breadcrumb">

            <nav>
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="index.php"><i class="bi bi-house-door"></i></a></li>
                  <li class="breadcrumb-item"><a>Gestion Generale</a></li>
                  <li class="breadcrumb-item active">Directions</li>
                </ol>
              </nav>
         
        </ol>
      </nav>

    </div><!-- End Page Title -->

    <section class="section dashboard">
      <div class="row">

        <!-- Left side columns -->
        <div class="col-lg-8">
          <div class="row">

            <!-- Sales Card -->

            <div class="card">
                <div class="card-body">
                  <h5 class="card-title"></h5>
    
                  <!-- Slides with captions -->
                  <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
                    <div class="carousel-indicators">
                      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="3" aria-label="Slide 4"></button>
                      <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="4" aria-label="Slide 5"></button>
                    </div>
                    <div class="carousel-inner">
                      <div class="carousel-item active">
                        <img src="assets/img/dgimg.png" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                          
                            <span class="badge bg-light text-dark"><h5>Direction Générale</h5></span></br>


                            <span class="badge bg-light text-dark"> <h3><a href="generaleDAI.php">DAI</a> | <a href="generaleDGR.php">DGR</a> | <a href="generaleDC.php">DC</a></h3></span> </br>
   
           
                        </div>
                      </div>
                      <div class="carousel-item">
                        <img src="assets/img/sgimg.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <span class="badge bg-light text-dark"><h5>Sécrétariat General</h5></span></br>


                         <span class="badge bg-light text-dark"> <h3><a href="secretariatDEPC.php">DEPC</a> | <a href="secretariatDR.php">DR</a> | <a href="secretariatDAJC.php">DAJC</a></h3></span> </br>


                        </div>
                      </div>


                      <div class="carousel-item">
                        <img src="assets/img/dexp.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">

                            <span class="badge bg-light text-dark"><h5>Direction Centrale d'Exploitation</h5></span></br>


                            <span class="badge bg-light text-dark"> <h3><a href="exploitationDCEI.php">DCEI</a> | <a href="exploitationDCP.php">DCP</a> | <a href="exploitationDTE.php">DTE</a> | <a href="exploitationD2MC.php">D2MC</a></h3></span> </br>
   
   
                        </div>
                      </div>

                      <div class="carousel-item">
                        <img src="assets/img/gest.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">

                            <span class="badge bg-light text-dark"><h5>Direction Centrale de l'Administration et de la Gestion </h5></span></br>


                            <span class="badge bg-light text-dark"> <h3><a href="administrationDLP.php">DLP</a> | <a href="administrationDFCG.php">DFCG</a> | <a href="administrationDRH.php">DRH</a></h3></span> </br>

       
                        </div>
                      </div>



                      <div class="carousel-item">
                        <img src="assets/img/sup.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">

                            <span class="badge bg-light text-dark"><h5>Direction Centrale des Supports </h5></span></br>


                            <span class="badge bg-light text-dark"> <h3><a href="supportDSID.php">DSID</a> | <a href="supportDOB.php">DOB</a> | <a href="supportDSM.php">DSM</a></h3></span> </br>
   
   
                        </div>
                      </div>












                    </div>
    




                    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Previous</span>
                    </button>
                    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="visually-hidden">Next</span>
                    </button>
    
                  </div><!-- End Slides with captions -->
    
                </div>
            </div>

      
          </div>
        </div><!-- End Left side columns -->

        <!-- Right side columns -->
        <div class="col-lg-4">

        

         

          <!-- Website Traffic -->
          <div class="card">
            

            <div class="card-body pb-0">
              <h5 class="card-title">Répartitions des équipements <span>| par Direction</span></h5>

              <div id="trafficChart" style="min-height: 400px;" class="echart"></div>

              <script>
                document.addEventListener("DOMContentLoaded", () => {
                  echarts.init(document.querySelector("#trafficChart")).setOption({
                    tooltip: {
                      trigger: 'item'
                    },
                    legend: {
                      top: '5%',
                      left: 'center'
                    },
                    series: [{
                      name: 'Equipements',
                      type: 'pie',
                      radius: ['40%', '70%'],
                      avoidLabelOverlap: false,
                      label: {
                        show: false,
                        position: 'center'
                      },
                      emphasis: {
                        label: {
                          show: true,
                          fontSize: '18',
                          fontWeight: 'bold'
                        }
                      },
                      labelLine: {
                        show: false
                      },
                      data: [{
                          value: 1048,
                          name: 'DSID'
                        },
                        {
                          value: 735,
                          name: 'DLP'
                        },
                        {
                          value: 580,
                          name: 'DCP'
                        },
                        {
                          value: 484,
                          name: 'DG'
                        },

                        {
                          value: 484,
                          name: 'AUTRES'
                        },
                        {
                          value: 300,
                          name: 'DRH'
                        }
                      ]
                    }]
                  });
                });
              </script>

            </div>
          </div><!-- End Website Traffic -->

       
        </div><!-- End Right side columns -->

      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright 2023 <strong><span>| NSIA - SERVICE SUPPORT</span></strong>. Tous droits réservés
    </div>
    <div class="credits">
      <!-- All the links in the footer should remain intact. -->
      <!-- You can delete the links only if you purchased the pro version. -->
      <!-- Licensing information: https://bootstrapmade.com/license/ -->
      <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
      Crée par Dibi Ange</a>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.umd.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.min.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>