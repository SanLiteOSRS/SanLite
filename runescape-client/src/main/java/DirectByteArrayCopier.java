import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("au")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-962589916"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()]; // L: 13
		this.directBuffer.position(0); // L: 14
		this.directBuffer.get(var1); // L: 15
		return var1; // L: 16
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1426025249"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length); // L: 20
		this.directBuffer.position(0); // L: 21
		this.directBuffer.put(var1); // L: 22
	} // L: 23

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/String;",
		garbageValue = "1088330937"
	)
	public static String method6579(Buffer var0) {
		return class155.method3247(var0, 32767); // L: 26
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "625731844"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = SoundCache.getWidgetChild(var0, var1); // L: 10080
		if (var4 != null && var4.onTargetEnter != null) { // L: 10081
			ScriptEvent var5 = new ScriptEvent(); // L: 10082
			var5.widget = var4; // L: 10083
			var5.args = var4.onTargetEnter; // L: 10084
			WorldMapSection1.runScriptEvent(var5); // L: 10085
		}

		Client.selectedSpellItemId = var3; // L: 10087
		Client.isSpellSelected = true; // L: 10088
		ModeWhere.selectedSpellWidget = var0; // L: 10089
		Client.selectedSpellChildIndex = var1; // L: 10090
		Canvas.selectedSpellFlags = var2; // L: 10091
		class218.invalidateWidget(var4); // L: 10092
	} // L: 10093
}
