package FPSCorba;


/**
* FPSCorba/ListenerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from fpscorba.idl
* Tuesday, May 6, 2014 11:33:58 AM EDT
*/

abstract public class ListenerHelper
{
  private static String  _id = "IDL:FPSCorba/Listener:1.0";

  public static void insert (org.omg.CORBA.Any a, FPSCorba.Listener that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FPSCorba.Listener extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (FPSCorba.ListenerHelper.id (), "Listener");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static FPSCorba.Listener read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ListenerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FPSCorba.Listener value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static FPSCorba.Listener narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof FPSCorba.Listener)
      return (FPSCorba.Listener)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      FPSCorba._ListenerStub stub = new FPSCorba._ListenerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static FPSCorba.Listener unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof FPSCorba.Listener)
      return (FPSCorba.Listener)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      FPSCorba._ListenerStub stub = new FPSCorba._ListenerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
