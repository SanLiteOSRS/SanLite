import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("aj")
class class12 extends SSLSocket {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	static ClanChannel field53;
	@ObfuscatedName("bt")
	static Image field51;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field52;
	@ObfuscatedName("aq")
	Certificate[] field55;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lan;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 98
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 276

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 113
	} // L: 114

	public boolean getEnableSessionCreation() {
		return false; // L: 121
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 126
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 117

	public boolean getNeedClientAuth() {
		return false; // L: 136
	}

	public SSLSession getSession() {
		return new class17(this); // L: 141
	}

	public String[] getSupportedProtocols() {
		return null; // L: 251
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 256
	}

	public boolean getUseClientMode() {
		return false; // L: 261
	}

	public boolean getWantClientAuth() {
		return false; // L: 266
	}

	public void setEnableSessionCreation(boolean var1) {
	} // L: 273

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 103
	}

	public void setEnabledProtocols(String[] var1) {
	} // L: 279

	public void setNeedClientAuth(boolean var1) {
	} // L: 282

	public void setWantClientAuth(boolean var1) {
	} // L: 288

	public void setUseClientMode(boolean var1) {
	} // L: 285

	public String[] getEnabledProtocols() {
		return null; // L: 131
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 108
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 292
	} // L: 342

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 270

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "567178265"
	)
	static int method145(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 1289
			var0 -= 1000; // L: 1290
			var3 = ArchiveLoader.field1070.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1291
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1293
		}

		String var4 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1294
		int[] var5 = null; // L: 1295
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') { // L: 1296
			int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1297
			if (var6 > 0) { // L: 1298
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]) { // L: 1299 1300
				}
			}

			var4 = var4.substring(0, var4.length() - 1); // L: 1302
		}

		Object[] var9 = new Object[var4.length() + 1]; // L: 1304

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) { // L: 1305
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 1306
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1307
			}
		}

		var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1309
		if (var7 != -1) { // L: 1310
			var9[0] = new Integer(var7);
		} else {
			var9 = null; // L: 1311
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) { // L: 1312
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) { // L: 1313
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) { // L: 1314
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) { // L: 1315
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) { // L: 1316
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) { // L: 1317
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) { // L: 1318
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) { // L: 1319
			var3.onVarTransmit = var9; // L: 1320
			var3.varTransmitTriggers = var5; // L: 1321
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) { // L: 1323
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) { // L: 1324
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) { // L: 1325
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) { // L: 1326
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) { // L: 1327
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) { // L: 1328
			var3.onInvTransmit = var9; // L: 1329
			var3.invTransmitTriggers = var5; // L: 1330
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) { // L: 1332
			var3.onStatTransmit = var9; // L: 1333
			var3.statTransmitTriggers = var5; // L: 1334
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) { // L: 1336
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) { // L: 1337
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) { // L: 1338
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) { // L: 1339
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) { // L: 1340
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) { // L: 1341
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) { // L: 1342
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) { // L: 1343
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) { // L: 1344
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) { // L: 1345
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) { // L: 1346
			var3.field3848 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) { // L: 1347
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) { // L: 1348
			var3.field3841 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) { // L: 1349
			var3.field3730 = var9;
		} else if (var0 == 1430) { // L: 1350
			var3.field3837 = var9;
		} else if (var0 == 1431) { // L: 1351
			var3.field3838 = var9;
		} else if (var0 == 1434) { // L: 1352
			var3.field3737 = var9;
		} else if (var0 == 1435) { // L: 1353
			var3.field3833 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) { // L: 1354
				return 2; // L: 1364
			}

			class345 var8 = var3.method6841(); // L: 1355
			if (var8 != null) { // L: 1356
				if (var0 == 1436) { // L: 1357
					var8.field3659 = var9;
				} else if (var0 == 1437) { // L: 1358
					var8.field3654 = var9;
				} else if (var0 == 1438) { // L: 1359
					var8.field3660 = var9;
				} else if (var0 == 1439) { // L: 1360
					var8.field3658 = var9;
				}
			}
		}

		var3.hasListener = true; // L: 1366
		return 1; // L: 1367
	}
}
