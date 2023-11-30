import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public abstract class class418 {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class418 field4554;
	@ObfuscatedName("ao")
	String field4551;
	@ObfuscatedName("ab")
	String field4552;
	@ObfuscatedName("au")
	boolean field4557;
	@ObfuscatedName("aa")
	boolean field4555;

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	class418(class418 var1) {
		this.field4554 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public abstract boolean vmethod7858();

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1285191143"
	)
	public boolean method7842() {
		return this.field4557; // L: 17
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7837() {
		return this.field4555; // L: 21
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1733616113"
	)
	public String method7834() {
		return "Error in task: " + this.field4552 + ", Error message: " + this.field4551; // L: 25
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "1680402489"
	)
	public class418 method7839() {
		return this.field4554; // L: 29
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "2"
	)
	void method7840(String var1) {
		this.field4557 = true; // L: 33
		this.field4551 = var1; // L: 34
	} // L: 35
}
