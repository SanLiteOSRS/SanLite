import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1108724319
	)
	public int field4591;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("av")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lun;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4591 = (int)(WallObject.method5027() / 1000L);
		this.username = var1;
		this.world = (short)var2; // L: 111
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lnq;Lnq;B)V",
		garbageValue = "1"
	)
	public static void method7785(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		SequenceDefinition.SequenceDefinition_archive = var0; // L: 51
		SequenceDefinition.SequenceDefinition_animationsArchive = var1; // L: 52
		class305.SequenceDefinition_skeletonsArchive = var2; // L: 53
	} // L: 54

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-35912619"
	)
	static float method7784(float[] var0, int var1, float var2) {
		float var3 = var0[var1]; // L: 108

		for (int var4 = var1 - 1; var4 >= 0; --var4) { // L: 109
			var3 = var0[var4] + var3 * var2; // L: 110
		}

		return var3; // L: 112
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "119"
	)
	static int method7786() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1543
			int var0 = 0; // L: 1544

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) { // L: 1545
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount; // L: 1546
			}

			return var0 * 10000 / Client.field767; // L: 1548
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-1"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class158.getWidgetChild(var0, var1); // L: 9983
		if (var4 != null && var4.onTargetEnter != null) { // L: 9984
			ScriptEvent var5 = new ScriptEvent(); // L: 9985
			var5.widget = var4; // L: 9986
			var5.args = var4.onTargetEnter; // L: 9987
			Clock.runScriptEvent(var5); // L: 9988
		}

		Client.selectedSpellItemId = var3; // L: 9990
		Client.isSpellSelected = true; // L: 9991
		ScriptFrame.selectedSpellWidget = var0; // L: 9992
		Client.selectedSpellChildIndex = var1; // L: 9993
		class125.selectedSpellFlags = var2; // L: 9994
		Messages.invalidateWidget(var4); // L: 9995
	} // L: 9996
}
