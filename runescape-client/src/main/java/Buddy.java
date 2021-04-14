import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lg")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -410155545
	)
	@Export("world")
	public int world;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1237996835
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 213892793
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "2093335339"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "1570510971"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-1660177096"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(ILcc;ZI)I",
		garbageValue = "1725299355"
	)
	static int method5815(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class139.getWidget(Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--class16.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class16.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else {
			return 2;
		}
	}
}
