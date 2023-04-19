import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("sl")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1107802607
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1927288833
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 397044137
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1570643775
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -161744223
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -769506393
	)
	@Export("z")
	int z;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 158616165
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1355788689
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("aa")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = ItemContainer.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-34"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true;
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method4135()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ItemContainer.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "152"
	)
	public static void method2025() {
		if (MouseHandler.KeyHandler_instance != null) { // L: 43
			synchronized(MouseHandler.KeyHandler_instance) { // L: 44
				MouseHandler.KeyHandler_instance = null; // L: 45
			} // L: 46
		}

	} // L: 48

	@ObfuscatedName("ao")
	static final void method2016(long var0) {
		ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var0; // L: 104
	} // L: 105

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "57"
	)
	static final void method2026(int var0, int var1) {
		if (var0 < 128) { // L: 3747
			var0 = 128; // L: 3748
		} else if (var0 > 383) { // L: 3750
			var0 = 383; // L: 3751
		}

		if (WorldMapSectionType.cameraPitch < var0) { // L: 3753
			WorldMapSectionType.cameraPitch = (var0 - WorldMapSectionType.cameraPitch) * WorldMapElement.field1937 / 1000 + WorldMapSectionType.cameraPitch + Archive.field4213; // L: 3754
			if (WorldMapSectionType.cameraPitch > var0) { // L: 3755
				WorldMapSectionType.cameraPitch = var0; // L: 3756
			}
		} else if (WorldMapSectionType.cameraPitch > var0) { // L: 3759
			WorldMapSectionType.cameraPitch -= (WorldMapSectionType.cameraPitch - var0) * WorldMapElement.field1937 / 1000 + Archive.field4213; // L: 3760
			if (WorldMapSectionType.cameraPitch < var0) { // L: 3761
				WorldMapSectionType.cameraPitch = var0; // L: 3762
			}
		}

		var1 &= 2047; // L: 3765
		int var2 = var1 - class125.cameraYaw; // L: 3766
		if (var2 > 1024) { // L: 3767
			var2 -= 2048; // L: 3768
		} else if (var2 < -1024) { // L: 3770
			var2 += 2048; // L: 3771
		}

		if (var2 > 0) { // L: 3773
			class125.cameraYaw = class125.cameraYaw + Archive.field4213 + var2 * WorldMapElement.field1937 / 1000; // L: 3774
			class125.cameraYaw &= 2047; // L: 3775
		} else if (var2 < 0) { // L: 3777
			class125.cameraYaw -= -var2 * WorldMapElement.field1937 / 1000 + Archive.field4213; // L: 3778
			class125.cameraYaw &= 2047; // L: 3779
		}

		int var3 = var1 - class125.cameraYaw; // L: 3781
		if (var3 > 1024) { // L: 3782
			var3 -= 2048; // L: 3783
		} else if (var3 < -1024) { // L: 3785
			var3 += 2048; // L: 3786
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 3788
			class125.cameraYaw = var1; // L: 3789
		}

	} // L: 3791

	public GraphicsObject() {
	}
}
