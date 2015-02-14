package br.com.jsflab.view.mb;

import java.io.File;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.com.jsflab.service.ImageService;

@ManagedBean(name="imageMB")
@ViewScoped
public class ImageMB extends AbstractMB{

	private static final long serialVersionUID = -3215385844256696577L;

	@ManagedProperty(value="#{imageService}")
	private ImageService imageService;

	private File imagem;

	@Override
	public void inicializar() {

	}

	public void handleFileUpload(FileUploadEvent fileUploadEvent) {

		UploadedFile file = fileUploadEvent.getFile();
		System.out.println(file.getClass().getName());
	}

	public ImageService getImageService() {

		return imageService;
	}

	public void setImageService(ImageService imageService) {

		this.imageService = imageService;
	}

	public File getImagem() {

		return imagem;
	}

	public void setImagem(File imagem) {

		this.imagem = imagem;
	}

}
