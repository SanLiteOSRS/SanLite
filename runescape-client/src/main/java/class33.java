import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class33 {
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field164;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1290922879
	)
	int field162;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 470581635
	)
	int field166;

	class33(int var1, int var2) {
		this.field162 = var1; // L: 14
		this.field166 = var2; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbf;B)Z",
		garbageValue = "-117"
	)
	boolean method455(class29 var1) {
		if (var1 == null) { // L: 19
			return false;
		} else {
			switch(this.field162) { // L: 20
			case 1:
				return var1.vmethod4317(this.field166); // L: 24
			case 2:
				return var1.vmethod4312(this.field166); // L: 22
			case 3:
				return var1.vmethod4324((char)this.field166); // L: 30
			case 4:
				return var1.vmethod4339(this.field166 == 1); // L: 26
			default:
				return false; // L: 28
			}
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lud;I)Ljava/lang/Object;",
		garbageValue = "-771282340"
	)
	static Object method457(class522 var0) {
		if (var0 == null) { // L: 5389
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5390
		} else {
			switch(var0.field5156) { // L: 5392
			case 1:
				return Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]; // L: 5394
			case 2:
				return Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 5398
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5396
			}
		}
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)I",
		garbageValue = "2"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12803
		return var1 != null ? var1.integer : var0.flags; // L: 12804 12805
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-521656120"
	)
	static void method453(int var0) {
		SequenceDefinition var1 = DevicePcmPlayerProvider.SequenceDefinition_get(var0); // L: 13004
		if (var1.isCachedModelIdSet()) { // L: 13005
			if (class192.method3717(var1.SequenceDefinition_cachedModelId) == 2) { // L: 13008
				Client.field533.add(var1.SequenceDefinition_cachedModelId); // L: 13009
			}

		}
	} // L: 13006 13011
}
