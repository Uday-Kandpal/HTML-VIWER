 package html;
 
 import org.w3c.dom.Document;
 import org.w3c.dom.Element;
 import org.w3c.dom.Node;
 import org.w3c.dom.NodeList;
 
 public class MenubarScanner
 {
   Document document;
   
   public MenubarScanner(Document document)
   {
     this.document = document;
   }
   
   public void visitDocument()
   {
     Element element = this.document.getDocumentElement();
     if ((element != null) && (element.getTagName().equals("USK_MenuBar"))) {
       visitElement_USK_MenuBar(element);
     }
     if ((element != null) && (element.getTagName().equals("MenuItem"))) {
       visitElement_MenuItem(element);
     }
     if ((element != null) && (element.getTagName().equals("name"))) {
       visitElement_name(element);
     }
     if ((element != null) && (element.getTagName().equals("bgcolor"))) {
       visitElement_bgcolor(element);
     }
     if ((element != null) && (element.getTagName().equals("text"))) {
       visitElement_text(element);
     }
     if ((element != null) && (element.getTagName().equals("sub"))) {
       visitElement_sub(element);
     }
     if ((element != null) && (element.getTagName().equals("Inherited"))) {
       visitElement_Inherited(element);
     }
     if ((element != null) && (element.getTagName().equals("Itemname"))) {
       visitElement_Itemname(element);
     }
     if ((element != null) && (element.getTagName().equals("ItemText"))) {
       visitElement_ItemText(element);
     }
     if ((element != null) && (element.getTagName().equals("selection"))) {
       visitElement_selection(element);
     }
   }
   
   void visitElement_USK_MenuBar(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
         if (nodeElement.getTagName().equals("MenuItem")) {
           visitElement_MenuItem(nodeElement);
         }
         break;
       }
     }
   }
   
   void visitElement_MenuItem(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
         if (nodeElement.getTagName().equals("name")) {
           visitElement_name(nodeElement);
         }
         if (nodeElement.getTagName().equals("bgcolor")) {
           visitElement_bgcolor(nodeElement);
         }
         if (nodeElement.getTagName().equals("text")) {
           visitElement_text(nodeElement);
         }
         if (nodeElement.getTagName().equals("sub")) {
           visitElement_sub(nodeElement);
         }
         if (nodeElement.getTagName().equals("selection")) {
           visitElement_selection(nodeElement);
         }
         break;
       }
     }
   }
   
   void visitElement_name(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       Element nodeElement;
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         nodeElement = (Element)node;
         break;
       }
     }
   }
   
   void visitElement_bgcolor(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       Element nodeElement;
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         nodeElement = (Element)node;
         break;
       }
     }
   }
   
   void visitElement_text(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       Element nodeElement;
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         nodeElement = (Element)node;
         break;
       }
     }
   }
   
   void visitElement_sub(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
         if (nodeElement.getTagName().equals("Inherited")) {
           visitElement_Inherited(nodeElement);
         }
         if (nodeElement.getTagName().equals("Itemname")) {
           visitElement_Itemname(nodeElement);
         }
         if (nodeElement.getTagName().equals("ItemText")) {
           visitElement_ItemText(nodeElement);
         }
         break;
       }
     }
   }
   
   void visitElement_Inherited(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
       }
     }
   }
   
   void visitElement_Itemname(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
       }
     }
   }
   
   void visitElement_ItemText(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         Element nodeElement = (Element)node;
       }
     }
   }
   
   void visitElement_selection(Element element)
   {
     NodeList nodes = element.getChildNodes();
     for (int i = 0; i < nodes.getLength(); i++)
     {
       Node node = nodes.item(i);
       Element nodeElement;
       switch (node.getNodeType())
       {
       case 4: 
         break;
       case 1: 
         nodeElement = (Element)node;
         break;
       }
     }
   }
 }



