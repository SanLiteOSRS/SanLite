import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public abstract class class406 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	class406 field4516;
	@ObfuscatedName("ay")
	String field4511;
	@ObfuscatedName("ap")
	String field4513;
	@ObfuscatedName("av")
	boolean field4514;
	@ObfuscatedName("an")
	boolean field4515;

	@ObfuscatedSignature(
		descriptor = "(Lps;)V"
	)
	class406(class406 var1) {
		this.field4516 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1705548260"
	)
	public abstract boolean vmethod7648(int var1);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-58"
	)
	public boolean method7627() {
		return this.field4514; // L: 17
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "21"
	)
	public boolean method7628() {
		return this.field4515; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "30161506"
	)
	public String method7629() {
		return "Error in task: " + this.field4513 + ", Error message: " + this.field4511; // L: 25
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lps;",
		garbageValue = "-1973328429"
	)
	public class406 method7641() {
		return this.field4516; // L: 29
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "41"
	)
	void method7631(String var1) {
		this.field4514 = true; // L: 33
		this.field4511 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	static void method7644(int var0, int var1) {
		if (ScriptFrame.clientPreferences.method2516() != 0 && var0 != -1) { // L: 3833
			ArrayList var2 = new ArrayList(); // L: 3834
			var2.add(new class317(class6.field20, var0, 0, ScriptFrame.clientPreferences.method2516(), false)); // L: 3835
			NPCComposition.method3873(var2, 0, 0, 0, 0, true); // L: 3836
			Client.playingJingle = true; // L: 3837
		}

	} // L: 3839
}
