import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public abstract class class425 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	class425 field4628;
	@ObfuscatedName("ai")
	String field4626;
	@ObfuscatedName("ar")
	String field4627;
	@ObfuscatedName("as")
	boolean field4629;
	@ObfuscatedName("aa")
	boolean field4630;

	@ObfuscatedSignature(
		descriptor = "(Lqe;)V"
	)
	class425(class425 var1) {
		this.field4628 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public abstract boolean vmethod8043();

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public boolean method8013() {
		return this.field4629; // L: 17
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "105"
	)
	public boolean method8038() {
		return this.field4630; // L: 21
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "404483720"
	)
	public String method8015() {
		return "Error in task: " + this.field4627 + ", Error message: " + this.field4626; // L: 25
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lqe;",
		garbageValue = "1254351439"
	)
	public class425 method8016() {
		return this.field4628; // L: 29
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "665644567"
	)
	void method8017(String var1) {
		this.field4629 = true; // L: 33
		this.field4626 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lda;III)V",
		garbageValue = "-1262684689"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 111
		Script var4;
		if (WorldMapLabelSize.isWorldMapEvent(var0.type)) { // L: 113
			class429.worldMapEvent = (WorldMapEvent)var3[0]; // L: 114
			WorldMapElement var6 = class139.WorldMapElement_get(class429.worldMapEvent.mapElement); // L: 115
			var4 = class223.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 116
		} else {
			int var5 = (Integer)var3[0]; // L: 119
			var4 = GrandExchangeOfferOwnWorldComparator.getScript(var5); // L: 120
		}

		if (var4 != null) { // L: 122
			PacketWriter.method2893(var0, var4, var1, var2); // L: 123
		}

	} // L: 125

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(I)Lsg;",
		garbageValue = "1413435483"
	)
	static PlatformInfo method8037() {
		return class31.field165; // L: 747
	}
}
