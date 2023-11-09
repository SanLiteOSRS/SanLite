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

@ObfuscatedName("ae")
class class12 extends SSLSocket {
	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("ay")
	Certificate[] field50;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Las;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhs;",
		garbageValue = "-9"
	)
	public static FloorUnderlayDefinition method162(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 25
		if (var1 != null) { // L: 26
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 27
			var1 = new FloorUnderlayDefinition(); // L: 28
			if (var2 != null) { // L: 29
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 30
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 31
			return var1; // L: 32
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZS)I",
		garbageValue = "-24"
	)
	static int method113(int var0, Script var1, boolean var2) {
		int var3 = -1; // L: 569
		Widget var4;
		if (var0 >= 2000) { // L: 571
			var0 -= 1000; // L: 572
			var3 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]; // L: 573
			var4 = ArchiveDiskActionHandler.getWidget(var3); // L: 574
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : HealthBarUpdate.field1223; // L: 576
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) { // L: 577
			class336.Interpreter_intStackSize -= 4; // L: 578
			var4.rawX = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 579
			var4.rawY = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 580
			var4.xAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 581
			var4.yAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 582
			HorizontalAlignment.invalidateWidget(var4); // L: 583
			class439.client.alignWidget(var4); // L: 584
			if (var3 != -1 && var4.type == 0) { // L: 585
				class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 586
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) { // L: 588
			class336.Interpreter_intStackSize -= 4; // L: 589
			var4.rawWidth = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize]; // L: 590
			var4.rawHeight = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 1]; // L: 591
			var4.widthAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 2]; // L: 592
			var4.heightAlignment = Interpreter.Interpreter_intStack[class336.Interpreter_intStackSize + 3]; // L: 593
			HorizontalAlignment.invalidateWidget(var4); // L: 594
			class439.client.alignWidget(var4); // L: 595
			if (var3 != -1 && var4.type == 0) { // L: 596
				class166.revalidateWidgetScroll(UserComparator6.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1; // L: 597
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) { // L: 599
			boolean var5 = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 600
			if (var5 != var4.isHidden) { // L: 601
				var4.isHidden = var5; // L: 602
				HorizontalAlignment.invalidateWidget(var4); // L: 603
			}

			return 1; // L: 605
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) { // L: 607
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 608
			return 1; // L: 609
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) { // L: 611
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize] == 1; // L: 612
			return 1; // L: 613
		} else {
			return 2; // L: 615
		}
	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "([Lmo;IB)V",
		garbageValue = "0"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11675
			Widget var3 = var0[var2]; // L: 11676
			if (var3 != null) { // L: 11677
				if (var3.type == 0) { // L: 11678
					if (var3.children != null) { // L: 11679
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11680
					if (var4 != null) { // L: 11681
						SpotAnimationDefinition.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11683
					var5 = new ScriptEvent(); // L: 11684
					var5.widget = var3; // L: 11685
					var5.args = var3.onDialogAbort; // L: 11686
					class260.runScriptEvent(var5); // L: 11687
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11689
					if (var3.childIndex >= 0) { // L: 11690
						Widget var6 = ArchiveDiskActionHandler.getWidget(var3.id); // L: 11691
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11692
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11696
					var5.widget = var3; // L: 11697
					var5.args = var3.onSubChange; // L: 11698
					class260.runScriptEvent(var5); // L: 11699
				}
			}
		}

	} // L: 11702

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lmo;IIII)V",
		garbageValue = "479970211"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 12331
		if (var4 != null) { // L: 12332
			if (Client.minimapState < 3) { // L: 12333
				UserComparator5.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 12334
			}

		}
	} // L: 12335
}
