package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.ItemLayer;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.mapping.Import;

public interface RSTile extends Tile
{
	@Import("gameObjects")
	@Override
	GameObject[] getGameObjects();

	@Import("itemLayer")
	@Override
	ItemLayer getItemLayer();

	@Import("decorativeObject")
	@Override
	DecorativeObject getDecorativeObject();

	@Import("decorativeObject")
	void setDecorativeObject(DecorativeObject object);
	
	@Import("groundObject")
	@Override
	GroundObject getGroundObject();

	@Import("groundObject")
	@Override
	void setGroundObject(GroundObject object);

	@Import("wallObject")
	@Override
	WallObject getWallObject();
	
	@Import("wallObject")
	void setWallObject(WallObject object);

	@Import("paint")
	@Override
	SceneTilePaint getSceneTilePaint();

	@Import("paint")
	void setSceneTilePaint(SceneTilePaint paint);

	@Import("model")
	@Override
	SceneTileModel getSceneTileModel();

	@Import("x")
	int getX();

	@Import("y")
	int getY();

	@Import("plane")
	@Override
	int getPlane();

	@Import("originalPlane")
	@Override
	int getRenderLevel();

	@Import("minPlane")
	int getPhysicalLevel();

	@Import("gameObjectsEdgeMask")
	int getFlags();

	@Import("linkedBelowTile")
	@Override
	RSTile getBridge();

	@Import("drawPrimary")
	boolean isDraw();

	@Import("drawPrimary")
	void setDraw(boolean draw);

	@Import("drawSecondary")
	boolean isVisible();

	@Import("drawSecondary")
	void setVisible(boolean visible);

	@Import("drawGameObjects")
	void setDrawEntities(boolean drawEntities);

	@Import("drawGameObjectEdges")
	void setWallCullDirection(int wallCullDirection);
}
