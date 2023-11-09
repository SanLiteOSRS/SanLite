import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("b")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("io")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lp;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Lp;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 285
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 306
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 288
		if (var1 == null) { // L: 289
			var1 = new Hashtable(); // L: 290
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 292
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 293
		DataOutputStream var4 = new DataOutputStream(var3); // L: 294
		var4.writeShort(var2.length + 3); // L: 295
		var4.writeByte(0); // L: 296
		var4.writeShort(var2.length); // L: 297
		var4.write(var2); // L: 298
		var4.close(); // L: 299
		var1.put(0, var3.toByteArray()); // L: 300
		return var1; // L: 301
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120776615"
	)
	static void method169() {
		GrandExchangeOfferOwnWorldComparator.method1171(24); // L: 1874
		MusicPatchNode2.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", ""); // L: 1875
	} // L: 1876

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZB)I",
		garbageValue = "-84"
	)
	static int method172(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1797
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1798
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemId; // L: 1799
			return 1; // L: 1800
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1802
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1803
			if (var3.itemId != -1) { // L: 1804
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 1805
			}

			return 1; // L: 1806
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1808
			int var5 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]; // L: 1809
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1810
			if (var4 != null) { // L: 1811
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0; // L: 1812
			}

			return 1; // L: 1813
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1815
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1816
			return 1; // L: 1817
		} else if (var0 == 2707) { // L: 1819
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1820
			Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.method6075() ? 1 : 0; // L: 1821
			return 1; // L: 1822
		} else if (var0 == 2708) { // L: 1824
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1825
			return class409.method7736(var3); // L: 1826
		} else if (var0 == 2709) { // L: 1828
			var3 = class281.getWidget(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]); // L: 1829
			return class129.method2946(var3); // L: 1830
		} else {
			return 2; // L: 1832
		}
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-7344383"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4437
	}
}
