package team1.videoplay.user.servlet;

import java.util.Date;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


class Mail {
    public static void main(String[] args) {
        try {

            System.out.println("�����ʼ�");
            Properties props = new Properties();//��������
            props.put("mail.transport.protocol", "smtp");//���÷����ʼ�Э��Ϊsmtp,Ĭ�Ͽ�ʡ
            props.put("mail.smtp.port", "25");//���÷����ʼ��˿�Ϊ25,Ĭ�Ͽ�ʡ
            props.put("mail.smtp.host", "172.18.53.53");//�����ʼ�������
            Session session = Session.getInstance(props);
            MimeMessage mimeMessage = new MimeMessage(session);  //����ʼ�
            mimeMessage.setFrom(new InternetAddress("qq@t60.com"));   //���÷�����
                    mimeMessage.setRecipients(Message.RecipientType.TO,
                                      InternetAddress.parse("ww@t60.com"));//�����ռ���
            mimeMessage.setSentDate(new Date());//���÷�������
            mimeMessage.setSubject("aa");//�����ʼ�����
            mimeMessage.setContent("bb", "text/html");////�����ʼ�����
            Transport.send(mimeMessage);//�����ʼ�

            System.out.println("�ռ��ʼ�");
            Store store = session.getStore("pop3");    //ָ�����ʼ�Э��Ϊpop3
            store.connect("172.18.53.53", "ww@t60.com", "ww");  //��¼
             Folder folder = store.getFolder("INBOX");   //��ȡ�ռ���
            folder.open(Folder.READ_WRITE);  //�Զ�д��ʽ��
            Message msgs[] = folder.getMessages();  //��ȡ�����ʼ�
            for (int i = 0; i < msgs.length; i++) {
                System.out.println("�����ˣ�" + msgs[i].getFrom()[0]);
                System.out.println("���⣺" + msgs[i].getSubject());
                System.out.println("���ݣ�" + msgs[i].getContent());
              //  msgs[i].setFlag(Flags.Flag.DELETED, true);    //ɾ���ʼ�
            }
            folder.close(true);   //�ر��ռ���
//
//            System.out.println("���������ʼ�");
//            Properties props1 = new Properties();
//            props1.put("mail.smtp.host", "127.0.0.1");
//            Session session1 = Session.getInstance(props1);
//            MimeMessage mimeMessage1 = new MimeMessage(session1);
//
//            mimeMessage1.setFrom(new InternetAddress("qq@t60.com"));
//            mimeMessage1.setRecipients(Message.RecipientType.TO,
//                                       InternetAddress.parse("ww@t60.com"));
//            mimeMessage1.setSentDate(new Date());
//            mimeMessage1.setSubject("aa");
//
//            MimeMultipart mimeMultipart = new MimeMultipart();
//            MimeBodyPart mimeBodyPart = new MimeBodyPart();
//
//            mimeBodyPart.setContent("bb", "text/html");
//            mimeMultipart.addBodyPart(mimeBodyPart);
//
//            mimeBodyPart = new MimeBodyPart();
//            FileDataSource fileDataSource = new FileDataSource("c:/aa.txt");
//            DataHandler dataHandler = new DataHandler(fileDataSource);
//            mimeBodyPart.setDataHandler(dataHandler);
//            mimeBodyPart.setFileName("aa.txt");
//            mimeMultipart.addBodyPart(mimeBodyPart);
//
//            mimeMessage1.setContent(mimeMultipart);
//
//            Transport.send(mimeMessage1);
            
            
////            System.out.println("�մ������ʼ�");
//            Store store1 = session1.getStore("pop3");
//            store1.connect("127.0.0.1", "ww@t60.com", "ww");
//            Folder folder1 = store1.getFolder("INBOX");
//            folder1.open(Folder.READ_WRITE);
//            Message[] msgs1 = folder1.getMessages();
//            for (int i = 0; i < msgs1.length; i++) {
//
//                System.out.println("��" + (i + 1) + "���ʼ���Ϣ���£�");
//                System.out.println("�ʼ����⣺" + msgs1[i].getSubject());
//                mimeMultipart = (MimeMultipart) msgs1[i].
//                                getContent();
//                mimeBodyPart = (MimeBodyPart) mimeMultipart.
//                               getBodyPart(0);
//                System.out.println("�ʼ����ģ�" + mimeBodyPart.getContent());
//
//                mimeBodyPart = (MimeBodyPart)
//                               mimeMultipart.getBodyPart(1);
//                System.out.println("��������" + mimeBodyPart.getFileName());
//                InputStream is = mimeBodyPart.getInputStream();
//                byte b[] = new byte[is.available()];
//                is.read(b);
//                System.out.println("�������ݣ�\n" + new String(b));
//                msgs1[i].setFlag(Flags.Flag.DELETED, true);
//
//            }
//            folder1.close(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

