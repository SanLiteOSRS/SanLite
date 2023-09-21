import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class171 extends class183 {
	@ObfuscatedName("tz")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ac")
	String field1804;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class171(class172 var1, String var2, String var3) {
		super(var1, var2); // L: 412
		this.this$0 = var1; // L: 411
		this.field1804 = var3; // L: 413
	} // L: 414

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1007456210"
	)
	public int vmethod3575() {
		return 1; // L: 417
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1667250407"
	)
	public String vmethod3574() {
		return this.field1804; // L: 422
	}
}
