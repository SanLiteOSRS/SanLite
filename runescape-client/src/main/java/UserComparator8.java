import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("aw")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqa;Lqa;I)I",
		garbageValue = "315336460"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) { // L: 15
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1; // L: 16
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1; // L: 19
		}

		return this.compareUser(var1, var2); // L: 21
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 25
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ldi;III)V",
		garbageValue = "-574325390"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 108
		Script var4;
		if (class345.isWorldMapEvent(var0.type)) { // L: 110
			ScriptFrame.worldMapEvent = (WorldMapEvent)var3[0]; // L: 111
			WorldMapElement var6 = SequenceDefinition.WorldMapElement_get(ScriptFrame.worldMapEvent.mapElement); // L: 112
			var4 = GameEngine.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 113
		} else {
			int var5 = (Integer)var3[0]; // L: 116
			var4 = Interpreter.getScript(var5); // L: 117
		}

		if (var4 != null) { // L: 119
			class18.method270(var0, var4, var1, var2); // L: 120
		}

	} // L: 122

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lmt;B)I",
		garbageValue = "-68"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get((long)var0.childIndex + ((long)var0.id << 32)); // L: 12707
		return var1 != null ? var1.integer : var0.flags; // L: 12708 12709
	}
}
