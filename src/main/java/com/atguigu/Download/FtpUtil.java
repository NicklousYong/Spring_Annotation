package com.atguigu.Download;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.*;



public class FtpUtil{

/**
 * ��ȡFTPClient����
 *
 * @param ftpHost
 *            FTP����������
 * @param ftpPassword
 *            FTP ��¼����
 * @param ftpUserName
 *            FTP��¼�û���
 * @param ftpPort
 *            FTP�˿� Ĭ��Ϊ21
 * @return
 */
public static FTPClient getFTPClient(String ftpHost, String ftpUserName,
        String ftpPassword, int ftpPort) {
        FTPClient ftpClient = new FTPClient();
        try {
        ftpClient = new FTPClient();
        ftpClient.connect(ftpHost, ftpPort);// ����FTP������
        ftpClient.login(ftpUserName, ftpPassword);// ��½FTP������
        if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
            System.out.println("δ���ӵ�FTP���û������������");
        ftpClient.disconnect();
        } else {

            System.out.println( "FTP���ӳɹ���");
        }
        } catch (SocketException e) {
        e.printStackTrace();
            System.out.println("FTP��IP��ַ���ܴ�������ȷ���á�");
        } catch (IOException e) {
        e.printStackTrace();
            System.out.println("FTP�Ķ˿ڴ���,����ȷ���á�");
        }
        return ftpClient;
        }

/*
 * ��FTP�����������ļ�
 *
 * @param ftpHost FTP IP��ַ
 *
 * @param ftpUserName FTP �û���
 *
 * @param ftpPassword FTP�û�������
 *
 * @param ftpPort FTP�˿�
 *
 * @param ftpPath FTP���������ļ�����·�� ��ʽ�� ftptest/aa
 *
 * @param localPath ���ص����ص�λ�� ��ʽ��H:/download
 *
 * @param fileName �ļ�����
 */
public static void downloadFtpFile(String ftpHost, String ftpUserName,
        String ftpPassword, int ftpPort, String ftpPath, String localPath,
        String fileName) {

        FTPClient ftpClient = null;

        try {
        ftpClient = getFTPClient(ftpHost, ftpUserName, ftpPassword, ftpPort);
        ftpClient.setControlEncoding("UTF-8"); // ����֧��
        ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        ftpClient.enterLocalPassiveMode();
        ftpClient.changeWorkingDirectory(ftpPath);

        File localFile = new File(localPath + File.separatorChar + fileName);
        OutputStream os = new FileOutputStream(localFile);
        ftpClient.retrieveFile(fileName, os);
        os.close();
        ftpClient.logout();

        } catch (FileNotFoundException e) {
            System.out.println("û���ҵ�" + ftpPath + "�ļ�");
        e.printStackTrace();
        } catch (SocketException e) {
            System.out.println("����FTPʧ��.");
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
            System.out.println("�ļ���ȡ����");
        e.printStackTrace();
        }

        }

        }