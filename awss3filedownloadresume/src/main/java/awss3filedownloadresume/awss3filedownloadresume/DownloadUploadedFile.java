package awss3filedownloadresume.awss3filedownloadresume;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class DownloadUploadedFile {

	public static void main(String[] args) throws IOException {
		String existingBucketName = "<your Bucket>";
		String keyName = "/" + "";

		AmazonS3 s3Client = new AmazonS3Client(
				new PropertiesCredentials(DownloadUploadedFile.class.getResourceAsStream("AwsCredentials.properties")));

		GetObjectRequest request = new GetObjectRequest(existingBucketName, keyName);
		S3Object object = s3Client.getObject(request);
		S3ObjectInputStream objectContent = object.getObjectContent();
		System.out.println(object.getObjectMetadata().getContentType());
		//System.out.println(object.getObjectMetadata().g);
		IOUtils.copy(objectContent, new FileOutputStream("D://upload//test.jpg"));

	}
}