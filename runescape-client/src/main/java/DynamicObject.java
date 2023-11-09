import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	static SpritePixels[] field1014;
	@ObfuscatedName("se")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -896504387
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1598644725
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1824972397
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2013071075
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1094170581
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1131276825
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 913053473
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -977017329
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(IIIIIIIZLit;)V"
	)
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1; // L: 20
		this.type = var2; // L: 21
		this.orientation = var3; // L: 22
		this.plane = var4; // L: 23
		this.x = var5; // L: 24
		this.y = var6; // L: 25
		if (var7 != -1) { // L: 26
			this.sequenceDefinition = class135.SequenceDefinition_get(var7); // L: 27
			this.frame = 0; // L: 28
			this.cycleStart = Client.cycle - 1; // L: 29
			if (this.sequenceDefinition.field2274 == 0 && var9 != null && var9 instanceof DynamicObject) { // L: 30
				DynamicObject var10 = (DynamicObject)var9; // L: 31
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame; // L: 33
					this.cycleStart = var10.cycleStart;
					return;
				}
			}

			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4074());
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) { // L: 53
				var1 = 100;
			}

			if (this.sequenceDefinition.isCachedModelIdSet()) { // L: 54
				var2 = this.sequenceDefinition.method4074(); // L: 68
				this.frame += var1; // L: 69
				var1 = 0; // L: 70
				if (this.frame >= var2) { // L: 71
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 72
					if (this.frame < 0 || this.frame > var2) { // L: 73
						this.sequenceDefinition = null; // L: 74
					}
				}
			} else {
				label79: {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 55
								break label79;
							}

							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount; // L: 59
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.sequenceDefinition = null; // L: 61
				}
			}

			this.cycleStart = Client.cycle - var1; // L: 78
		}

		ObjectComposition var12 = class90.getObjectDefinition(this.id); // L: 80
		if (var12.transforms != null) {
			var12 = var12.transform(); // L: 81
		}

		if (var12 == null) { // L: 82
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) { // L: 85
				var2 = var12.sizeX; // L: 90
				var3 = var12.sizeY; // L: 91
			} else {
				var2 = var12.sizeY; // L: 86
				var3 = var12.sizeX; // L: 87
			}

			int var4 = (var2 >> 1) + this.x; // L: 93
			int var5 = (var2 + 1 >> 1) + this.x; // L: 94
			int var6 = (var3 >> 1) + this.y; // L: 95
			int var7 = (var3 + 1 >> 1) + this.y; // L: 96
			int[][] var8 = Tiles.Tiles_heights[this.plane]; // L: 97
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var4][var6] + var8[var5][var6] >> 2; // L: 98
			int var10 = (this.x << 7) + (var2 << 6); // L: 99
			int var11 = (this.y << 7) + (var3 << 6); // L: 100
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame); // L: 101
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1663341979"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (World.World_request == null) { // L: 32
				World.World_request = WorldMapLabel.urlRequester.request(new URL(class292.field3084));
			} else if (World.World_request.isDone()) { // L: 34
				byte[] var0 = World.World_request.getResponse(); // L: 35
				Buffer var1 = new Buffer(var0); // L: 36
				var1.readInt(); // L: 37
				World.World_count = var1.readUnsignedShort(); // L: 38
				class387.World_worlds = new World[World.World_count]; // L: 39

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) { // L: 40 48
					var3 = class387.World_worlds[var2] = new World(); // L: 41
					var3.id = var1.readUnsignedShort(); // L: 42
					var3.properties = var1.readInt(); // L: 43
					var3.host = var1.readStringCp1252NullTerminated(); // L: 44
					var3.activity = var1.readStringCp1252NullTerminated(); // L: 45
					var3.location = var1.readUnsignedByte(); // L: 46
					var3.population = var1.readShort(); // L: 47
				}

				VarbitComposition.sortWorlds(class387.World_worlds, 0, class387.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2); // L: 50
				World.World_request = null; // L: 51
				return true; // L: 52
			}
		} catch (Exception var4) { // L: 56
			var4.printStackTrace(); // L: 57
			World.World_request = null; // L: 58
		}

		return false; // L: 60
	}
}
