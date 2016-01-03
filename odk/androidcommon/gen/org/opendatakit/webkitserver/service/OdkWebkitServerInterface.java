/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\odk\\androidcommon.opendatakit-a83c1e05a1b9\\androidcommon.opendatakit-a83c1e05a1b9\\androidcommon\\src\\org\\opendatakit\\webkitserver\\service\\OdkWebkitServerInterface.aidl
 */
package org.opendatakit.webkitserver.service;
public interface OdkWebkitServerInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.opendatakit.webkitserver.service.OdkWebkitServerInterface
{
private static final java.lang.String DESCRIPTOR = "org.opendatakit.webkitserver.service.OdkWebkitServerInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.opendatakit.webkitserver.service.OdkWebkitServerInterface interface,
 * generating a proxy if needed.
 */
public static org.opendatakit.webkitserver.service.OdkWebkitServerInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.opendatakit.webkitserver.service.OdkWebkitServerInterface))) {
return ((org.opendatakit.webkitserver.service.OdkWebkitServerInterface)iin);
}
return new org.opendatakit.webkitserver.service.OdkWebkitServerInterface.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_restart:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.restart();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.opendatakit.webkitserver.service.OdkWebkitServerInterface
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public boolean restart() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_restart, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_restart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public boolean restart() throws android.os.RemoteException;
}
